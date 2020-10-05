import com.whitepaper.wordcounter.WordCounterServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;


public class ApplicationServer {

    private static Logger logger = LogManager.getLogger(ApplicationServer.class);
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new WordCounterServiceImpl())
                .build();

        logger.info("teste");
        server.start();
        server.awaitTermination();
    }
}
