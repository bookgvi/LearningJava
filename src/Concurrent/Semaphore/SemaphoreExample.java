package Concurrent.Semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreExample implements Runnable {
  private int riderNum = 0;
  public static Semaphore semaphore;
  public static int RIDERS_COUNT = 10;
  public static int RIDERS_PLACES_COUNT = 7;
  public static boolean[] PLACES;

  SemaphoreExample() {
  }

  public SemaphoreExample(int riderNum) {
    this.riderNum = riderNum;
  }

  @Override
  public void run() {
    System.out.printf("Всадник %s подошел к контроллеру %n", riderNum);
    try {
      semaphore.acquire();
      int riderPlace = -1;
      synchronized (PLACES) {
        for (int i = 0; i < RIDERS_PLACES_COUNT; i++) {
          if (PLACES[i]) {
            PLACES[i] = false;
            riderPlace = i;
            System.out.printf("Всадник %s занял место %s %n", riderNum, riderPlace);
            break;
          }
        }
      }
      Thread.sleep(new Random().nextInt(10000));
      semaphore.release();
      synchronized (PLACES) {
        PLACES[riderPlace] = true;
        System.out.printf("\t\tВсадник %s покинул контроллер %s %n", riderNum, riderPlace);
      }

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
