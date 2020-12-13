import Concurrent.CyclicBarier.CyclicBarierExample;
import Concurrent.Exchanger.ExchangerExample;
import Concurrent.Phaser.PhaserExample;
import Concurrent.Semaphore.SemaphoreExample;
import Concurrent.CountDownLatch.CountDownLatchExample;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

import static Concurrent.CountDownLatch.CountDownLatchExample.countDownLatch;
import static Concurrent.Phaser.PhaserExample.*;
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

//    CyclicBarierExample.cyclicBarrier = new CyclicBarrier(CyclicBarierExample.FERRY_BOAT_SIZE, new CyclicBarierExample.FerryBoat());
//    for (int i = 1; i <= CyclicBarierExample.CARS_COUNT; i++) {
//      Thread.sleep(400);
//      new Thread(new CyclicBarierExample.Car(i)).start();
//    }

//    ExchangerExample.exchanger = new Exchanger<String>();
//    new Thread(new ExchangerExample.GetMsg()).start();
//    new Thread(new ExchangerExample.PutMsg()).start();

    train = new Phaser(1);
    ArrayList<PhaserExample.Passenger> passengers = new ArrayList<>();
    for(int i = 1; i <= PASSENGERS_COUNT; i++) {
      int dep = new Random().nextInt(STATIONS_COUNT);
      if (dep == 0) dep++;
      int dest = new Random().nextInt(STATIONS_COUNT - dep) + dep;
      passengers.add(new PhaserExample.Passenger(i, dep, dest));
    }

    for(int i = 0; i <= STATIONS_COUNT; i++) {
      switch (i) {
        case 0:
          System.out.println("Поезд вышел из депо...");
          train.arrive();
          break;
        case 7:
          System.out.println("Поезд вернулся в депо...");
          train.arriveAndDeregister();
          break;
        default:
          int currentStation = train.getPhase();
          System.out.printf("Станция %s%n", currentStation);
          for (Passenger passenger: passengers) {
            if (passenger.getDeparture() == currentStation) {
              train.register();
              new Thread(passenger).start();
            }
          }
          train.arriveAndAwaitAdvance();
          System.out.println("Осторожно двери закрыватся");
          break;
      }
    }
  }
}
