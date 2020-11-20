package StreamIO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

class SocketServer {
  final static int PORT = 9999;
  final static String ADDRESS = "127.0.0.1";
  private final String DEFAULT_FILE = "/Users/bookgvi/IdeaProjects/LearningJava/files/file1.txt";

  void listenConnection() {
    ServerSocket serverSocket = null;
    FileWriter fileWriter = null;
    try {
      serverSocket = new ServerSocket(PORT);
      fileWriter = new FileWriter(DEFAULT_FILE);

      Socket clientConnection = serverSocket.accept();
      InputStreamReader socketInputStreamReader = new InputStreamReader(clientConnection.getInputStream());
      BufferedReader socketBufferedReader = new BufferedReader(socketInputStreamReader);

      String str;
      while ((str = socketBufferedReader.readLine()) != null) {
        System.out.printf("%s%n", str);
        fileWriter.write(str);
      }
    } catch (IOException socketEx) {
      socketEx.getStackTrace();
    } finally {
      try {
        assert serverSocket != null;
        serverSocket.close();
        assert fileWriter != null;
        fileWriter.close();
      } catch (IOException | NullPointerException ignored) {
      }
    }
  }
}
