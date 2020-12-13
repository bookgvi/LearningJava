package Concurrent.Exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
  public static Exchanger<String> exchanger;

  public static class GetMsg implements Runnable {
    private String msg = "Hello, world";

    @Override
    public void run() {
      try {
        this.msg = exchanger.exchange(null);
        System.out.printf("GetMsg thread: %s%n", msg);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static class PutMsg implements Runnable {
    private String msg = "Hello, Java";
    @Override
    public void run() {
      try {
        msg = exchanger.exchange(msg);
        System.out.printf("PutMsg thread: %s%n", msg);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
