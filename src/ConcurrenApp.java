import Concurrent.Semaphore.SemaphoreExample;

import java.util.concurrent.Semaphore;

import static Concurrent.Semaphore.SemaphoreExample.*;

public class ConcurrenApp {
  public static void main(String[] args) throws InterruptedException {
    PLACES = new boolean[RIDERS_PLACES_COUNT];
    semaphore = new Semaphore(PLACES.length, true);
    for (int i = 0; i < RIDERS_PLACES_COUNT; i++) {
      PLACES[i] = true;
    }
    for (int i = 0; i < RIDERS_COUNT; i++) {
      new Thread(new SemaphoreExample(i)).start();
      Thread.sleep(100);
    }
  }
}
