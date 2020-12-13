package Concurrent.CyclicBarier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarierExample {
  public static int CARS_COUNT = 9;
  public static int FERRY_BOAT_SIZE = 4;
  public static CyclicBarrier cyclicBarrier;

  public static class Car implements Runnable {
    private int carNumber;

    public Car() {
    }

    public Car(int carNumber) {
      this.carNumber = carNumber;
    }

    @Override
    public void run() {
      System.out.printf("К парому подъехала машина %s%n", carNumber);
      try {
        cyclicBarrier.await(10000, TimeUnit.MILLISECONDS);
        Thread.sleep(900);
        System.out.printf("\tМашина %s продолжила движение после переправы%n", carNumber);
      } catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
        e.printStackTrace();
      }
    }
  }

  public static class FerryBoat implements Runnable {
    @Override
    public void run() {
      System.out.print("\t\tПаром начал переправу....\n");
    }
  }
}
