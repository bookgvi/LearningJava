import MultiThread.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import static java.lang.Thread.sleep;

public class MultiThread {
  private static final int THREAD_COUNT = 5;
  private static final int DELAY_BASE = 5;

  private static int delay() {
    Random rnd = new Random();
    int delay = rnd.nextInt(DELAY_BASE);
    if (delay < 10) delay *= 50;
    else if (delay < 100) delay &= 5;
    return delay;
  }

  public static void main(String[] args) throws InterruptedException {
    ThreadGroup threadGroup = new ThreadGroup("QQQ");
    ConcurrentObj concurrentObj = new ConcurrentObj();
    Map<Integer, String> map = concurrentObj.getMap(true);

    Thread thread;
    MyThread myThread = new MyThread(threadGroup, map);
    for (int i = 1; i <= THREAD_COUNT; i++) {
      String name = "myTread" + i;
      thread = new Thread(threadGroup, myThread, name);
      myThread.setName(name);
      thread.start();
      sleep(MultiThread.delay());
    }
    for (Object o : map.keySet()) {
      System.out.printf("%s ", map.get(o));
    }
    System.out.println(threadGroup.activeCount());
  }
}
