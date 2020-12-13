package Concurrent.Phaser;

import java.util.Random;
import java.util.concurrent.Phaser;

public class PhaserExample {
  public static Phaser train;
  public static int PASSENGERS_COUNT = 10;
  public static int STATIONS_COUNT = 7;

  public static class Passenger implements Runnable {
    private int id;
    private int departure;
    private int destination;

    public Passenger() {
    }

    public Passenger(int id, int departure, int destination) {
      this.id = id;
      this.departure = departure;
      this.destination = destination;
    }

    public int getDeparture() {
      return departure;
    }

    @Override
    public void run() {
      System.out.printf("Пассажир %s вошел в вагон%n", this);
      while(this.destination != train.getPhase()) {
        train.arriveAndAwaitAdvance();
      }
      try {
        Thread.sleep(new Random().nextInt(500));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.printf("Пассажир %s вышел на станции %s%n", id, this.destination);
      train.arriveAndDeregister();
    }

    @Override
    public String toString() {
      return id + " { " +
        "departure = " + departure +
        ", destination = " + destination +
        " }";
    }
  }

}
