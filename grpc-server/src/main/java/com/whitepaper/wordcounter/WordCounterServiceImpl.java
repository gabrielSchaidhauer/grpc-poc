package com.whitepaper.wordcounter;


import io.grpc.stub.StreamObserver;
import wordcounter.*;

import java.util.Optional;

public class WordCounterServiceImpl extends WordCounterServiceBaseGrpc.WordCounterServiceBaseImplBase {

    @Override
    public void countWords(CountRequest request, StreamObserver<CountResponse> responseObserver) {
        int wordsCount = Optional
                .ofNullable(request.getMessage())
                .orElse("")
                .split(" ")
                .length;

        CountResponse reponse = CountResponse
                .newBuilder()
                .setCount(wordsCount)
                .build();

        responseObserver.onNext(reponse);
        responseObserver.onCompleted();
    }

    @Override
    public void filterWords(FilterWordsRequest request, StreamObserver<FilterWordsResponse> responseObserver) {
        String[] words = Optional.ofNullable(request.getMessage())
                .orElse("")
                .split(" ");

        for(String word : words) {
            responseObserver.onNext(FilterWordsResponse.newBuilder().setWord(word).build());
        }

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<BuildMessageRequest> buildMessage(StreamObserver<BuildMessageResponse> responseObserver) {
        return new StreamObserver<BuildMessageRequest>() {
            StringBuilder message = new StringBuilder();
            @Override
            public void onNext(BuildMessageRequest value) {
                message.append(Optional.ofNullable(value.getWord()).orElse("")).append(" ");
            }

            @Override
            public void onError(Throwable t) {
                // Do nothing
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(BuildMessageResponse.newBuilder().setMessage(message.toString()).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<CountLettersRequest> countLetters(StreamObserver<CountLettersResponse> responseObserver) {
        return new StreamObserver<CountLettersRequest>() {
            @Override
            public void onNext(CountLettersRequest value) {
                String word = Optional.ofNullable(value.getWord()).orElse("");
                int count = word.length();
                responseObserver.onNext(CountLettersResponse
                        .newBuilder()
                        .setCount(count)
                        .setWord(word)
                        .build());
            }

            @Override
            public void onError(Throwable t) {
                // Do nothing
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
