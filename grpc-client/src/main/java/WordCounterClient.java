import com.whitepaper.wordcounter.CountRequest;
import com.whitepaper.wordcounter.CountResponse;
import com.whitepaper.wordcounter.WordCounterServiceBaseGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

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
