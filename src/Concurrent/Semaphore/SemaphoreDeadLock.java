package Concurrent.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDeadLock {
  public static void runme() throws Exception {
    Semaphore s1 = new Semaphore(1);
    Semaphore s2 = new Semaphore(1);

    Thread t = new Thread(new DoubleResourceGrabber(s1, s2));
    // now reverse them ... here comes trouble!
    Thread t2 = new Thread(new DoubleResourceGrabber(s2, s1));

    t.start();
    t2.start();

    t.join();
    t2.join();
    System.out.println("We got lucky!");
  }

  private static class DoubleResourceGrabber implements Runnable {
    private Semaphore first;
    private Semaphore second;

    DoubleResourceGrabber (Semaphore s1, Semaphore s2) {
      first = s1;
      second = s2;
    }

    public void run() {
      try {
        Thread t = Thread.currentThread();

        first.acquire();
        System.out.println(t + " acquired " + first);

        Thread.sleep(200); // demonstrate deadlock

        second.acquire();
        System.out.println(t + " acquired " + second);

        second.release();
        System.out.println(t + " released " + second);

        first.release();
        System.out.println(t + " released " + first);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }
}
