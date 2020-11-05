import MultiThread.*;

import static java.lang.Thread.sleep;

public class MultiThread {
  public static void main(String[] args) throws InterruptedException {
    Egg egg = new Egg();
    Egg2 egg2 = new Egg2();

    egg.start();
    egg2.start();
    sleep(500);
//    for(int i = 5; i < 10; i++) {
//      sleep(500);
//      System.out.print("j ");
//    }
  }
}
