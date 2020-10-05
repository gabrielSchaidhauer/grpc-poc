package com.whitepaper.wordcounter;

import com.whitepaper.CountRequest;
import com.whitepaper.CountResponse;
import com.whitepaper.WordCounterServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Optional;

public class WordCounterServiceImpl extends WordCounterServiceGrpc.WordCounterServiceImplBase {

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
