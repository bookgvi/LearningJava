import StreamIO.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StreamIO {
  public static void main(String[] args) throws IOException {
//    File file = new File();
//    file.writeToFile("/Users/bookgvi/IdeaProjects/LearningJava/files/file12.txt", (InputStream) null);
//    file.getFromFile("/Users/bookgvi/IdeaProjects/LearningJava/files/file12.txt");

//    final int THREADS_COUNT = 10;
//
//    ExecutorService executorService = Executors.newFixedThreadPool(THREADS_COUNT);
//
//    for (int i = 0; i < THREADS_COUNT; i++) {
//      executorService.submit(new SocketThread());
//    }
//    SocketThread socketThread = new SocketThread();
//
//    String strForSend = "qweqweqew \n" +
//      "Hey \n" +
//      "there!!! \n" +
//      "QWEE\n";
//    SocketCLient socketCLient = new SocketCLient();
//    socketCLient.request(strForSend);
//
//    executorService.shutdown();

    ReadFile rf = new ReadFile("/Users/bookgvi/IdeaProjects/LearningJava/src/StreamIO.java");
    rf.readFileToConsole();
  }
}
