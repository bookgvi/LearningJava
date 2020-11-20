package StreamIO;

import java.io.*;
import java.net.Socket;

public class SocketCLient {
  public void request(String str) {
    Socket socket = null;
    PrintWriter writer = null;
    try {
      socket = new Socket(SocketServer.ADDRESS, SocketServer.PORT);
      writer = new PrintWriter(socket.getOutputStream(), true);
      writer.println(str);
    } catch (IOException socketEx) {
      socketEx.getStackTrace();
    } finally {
      try {
        assert socket != null;
        socket.close();
        assert writer !=null;
        writer.close();
      } catch (NullPointerException | IOException ignored) {
      }
    }
  }
  public void request1(String str) {
    try (
      Socket socket = new Socket(SocketServer.ADDRESS, SocketServer.PORT);
      OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
      BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
    ) {
      bufferedWriter.write(str + " SIGNATURE");
    } catch (IOException ex) {
      ex.getStackTrace();
    }
  }
}
