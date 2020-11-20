package StreamIO;

public class SocketThread implements Runnable {
  @Override
  public void run() {
    SocketServer socketServer = new SocketServer();
    socketServer.listenConnection();
  }
}
