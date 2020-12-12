package Concurrent.CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample implements Runnable {
  private int ridersNum;
  public static CountDownLatch countDownLatch;

  CountDownLatchExample() {
  }

  public CountDownLatchExample(int ridersNum) {
    this.ridersNum = ridersNum;
  }

  @Override
  public void run() {
    System.out.printf("Всадник %s вышел на старт %n", ridersNum);
    countDownLatch.countDown();
    try {
      countDownLatch.await();
      Thread.sleep(new Random().nextInt(10000));
      System.out.printf("\t\tВсадник %s финишировал %n", ridersNum);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
