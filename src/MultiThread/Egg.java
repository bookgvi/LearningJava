package MultiThread;

public class Egg extends Thread {
  @Override
  public void run() {
    for(int i = 0; i < 5; i++) {
      try {
        sleep(1000);
        System.out.print("i ");
      } catch (InterruptedException ignored) {
      }
    }
  }
}
