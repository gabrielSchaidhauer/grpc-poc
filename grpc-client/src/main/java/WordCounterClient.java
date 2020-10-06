
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import wordcounter.CountRequest;
import wordcounter.CountResponse;
import wordcounter.WordCounterServiceBaseGrpc;

public class WordCounterClient {
    public static void main(String[] args) {
        String testString = "This is a string to test with 9 words";
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        WordCounterServiceBaseGrpc.WordCounterServiceBaseBlockingStub stub = WordCounterServiceBaseGrpc.newBlockingStub(channel);
        CountRequest request = CountRequest
                .newBuilder()
                .setMessage(testString)
                .build();

        CountResponse response = stub.countWords(request);
        System.out.println(response.getCount());
    }

}
