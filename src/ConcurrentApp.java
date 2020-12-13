import Concurrent.CyclicBarier.CyclicBarierExample;
import Concurrent.Semaphore.SemaphoreExample;
import Concurrent.CountDownLatch.CountDownLatchExample;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

import static Concurrent.CountDownLatch.CountDownLatchExample.countDownLatch;
import static Concurrent.Semaphore.SemaphoreExample.*;

public class ConcurrentApp {
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

//    countDownLatch = new CountDownLatch(RIDERS_COUNT + 3);
//    for (int i = 0; i < RIDERS_COUNT; i++) {
//      new Thread(new CountDownLatchExample(i)).start();
//      Thread.sleep(new Random().nextInt(500));
//    }
//    if (countDownLatch.getCount() > 3) Thread.sleep(500);
//
//    System.out.print("На старт...\n");
//    Thread.sleep(new Random().nextInt(1500));
//    countDownLatch.countDown();
//    System.out.print("Внимание...\n");
//    Thread.sleep(new Random().nextInt(1500));
//    countDownLatch.countDown();
//    System.out.print("Марш...\n");
//    Thread.sleep(new Random().nextInt(1500));
//    countDownLatch.countDown();

    CyclicBarierExample.cyclicBarrier = new CyclicBarrier(CyclicBarierExample.FERRY_BOAT_SIZE, new CyclicBarierExample.FerryBoat());
    for (int i = 1; i <= CyclicBarierExample.CARS_COUNT; i++) {
      Thread.sleep(400);
      new Thread(new CyclicBarierExample.Car(i)).start();
    }
  }
}
