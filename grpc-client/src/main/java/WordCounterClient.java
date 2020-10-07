
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import wordcounter.*;

import java.util.Iterator;

public class WordCounterClient {
    public static void main(String[] args) throws InterruptedException {
        String testString = "This is a string to test with 9 words";
        String[] splitted = testString.split(" ");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        WordCounterServiceBaseGrpc.WordCounterServiceBaseBlockingStub stub = WordCounterServiceBaseGrpc.newBlockingStub(channel);
        WordCounterServiceBaseGrpc.WordCounterServiceBaseStub asyncStub = WordCounterServiceBaseGrpc.newStub(channel);

        System.out.println("Count Words:");
        CountRequest request = CountRequest
                .newBuilder()
                .setMessage(testString)
                .build();

        CountResponse response = stub.countWords(request);
        System.out.println(response.getCount());

        System.out.println("\nFilter words:");
        FilterWordsRequest filterWordsRequest = FilterWordsRequest
                .newBuilder()
                .setMessage(testString)
                .build();

        Iterator<FilterWordsResponse> filterWordsResponseIterator = stub.filterWords(filterWordsRequest);
        while (filterWordsResponseIterator.hasNext()) {
            FilterWordsResponse filterWordsResponse = filterWordsResponseIterator.next();
            System.out.println(filterWordsResponse.getWord());
        }

        System.out.println("\nBuild Message:");

        StreamObserver<BuildMessageRequest> requestStreamObserver = asyncStub.buildMessage(new StreamObserver<BuildMessageResponse>() {
            @Override
            public void onNext(BuildMessageResponse value) {
                System.out.println(value.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                // Do nothing
            }

            @Override
            public void onCompleted() {
                // Do nothing;
            }
        });

        for (String word : splitted) {
            requestStreamObserver.onNext(BuildMessageRequest.newBuilder().setWord(word).build());
        }
        requestStreamObserver.onCompleted();

        Thread.sleep(500);

        System.out.println("\nCount letters:");

        StreamObserver<CountLettersRequest> countStreamObserver = asyncStub.countLetters(new StreamObserver<CountLettersResponse>() {
            @Override
            public void onNext(CountLettersResponse value) {
                System.out.println(value.getWord() + " - " + value.getCount());
            }

            @Override
            public void onError(Throwable t) {
                // Do nothing
            }

            @Override
            public void onCompleted() {
                // Do nothing
            }
        });

        for (String word : splitted) {
            countStreamObserver.onNext(CountLettersRequest.newBuilder().setWord(word).build());
        }
        countStreamObserver.onCompleted();
    }
}
