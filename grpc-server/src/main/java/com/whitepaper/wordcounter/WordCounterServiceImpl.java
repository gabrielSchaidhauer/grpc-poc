package com.whitepaper.wordcounter;


import io.grpc.stub.StreamObserver;
import wordcounter.CountRequest;
import wordcounter.CountResponse;
import wordcounter.WordCounterServiceBaseGrpc;

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
}
