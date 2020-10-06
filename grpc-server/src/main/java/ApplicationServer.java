import com.whitepaper.wordcounter.WordCounterServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;


public class ApplicationServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new WordCounterServiceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }
}
