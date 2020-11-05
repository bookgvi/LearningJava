package MultiThread;

public class Egg2 extends Thread {
  @Override
  public void run() {
    for(int i = 0; i < 5; i++) {
      try {
        sleep(1000);
        System.out.print("k ");
      } catch (InterruptedException ignored) {
      }
    }
  }
}
