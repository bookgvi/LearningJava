import Concurrent.Semaphore.SemaphoreExample;
import Concurrent.CountDownLatch.CountDownLatchExample;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

import static Concurrent.CountDownLatch.CountDownLatchExample.countDownLatch;
import static Concurrent.Semaphore.SemaphoreExample.*;

public class ConcurrenеApp {
  public static void main(String[] args) throws InterruptedException {
    PLACES = new boolean[RIDERS_PLACES_COUNT];
    semaphore = new Semaphore(PLACES.length, true);
//    for (int i = 0; i < RIDERS_PLACES_COUNT; i++) {
//      PLACES[i] = true;
//    }
//    for (int i = 0; i < RIDERS_COUNT; i++) {
//      new Thread(new SemaphoreExample(i)).start();
//      Thread.sleep(100);
//    }

    countDownLatch = new CountDownLatch(RIDERS_COUNT);
    for (int i = 0; i < RIDERS_COUNT; i++) {
      new Thread(new CountDownLatchExample(i)).start();
      Thread.sleep(new Random().nextInt(500));
    }
  }
}
