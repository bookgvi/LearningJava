import MultiThread.*;

import java.util.*;

import static java.lang.Thread.sleep;

public class MultiThread {
  private static final int THREAD_COUNT = 5;
  private static final int DELAY_BASE = 5;

  private static int delay() {
    Random rnd = new Random();
    int delay = rnd.nextInt(DELAY_BASE);
    if (delay < 10) delay *= 50;
    else if (delay < 100) delay *= 5;
    return delay;
  }

  public static void main(String[] args) throws InterruptedException {
    Random rnd = new Random();
    ThreadGroup threadGroup = new ThreadGroup("QQQ");
    ConcurrentObj concurrentObj = new ConcurrentObj();
    List<MyRunnable> tasks = new ArrayList<>();
    Map<Integer, String> map = concurrentObj.getMap(true);
    Thread thread;

    for (int i = 1; i <= THREAD_COUNT; i++) {
      MyRunnable myRunnable = new MyRunnable(true, map);
      tasks.add(myRunnable);
      String name = "myTread-" + i;
      thread = new Thread(threadGroup, myRunnable);
      thread.start();
    }


    sleep(1000);
    System.out.printf("%nActive threads: %s%n", threadGroup.activeCount());
    while (ConcurrentObj.MAP_SIZE - map.size() - 1 > 0) {
    }
    tasks.forEach(task -> task.setActive(false));

    for (Object o : map.keySet()) {
      System.out.printf("%s: %s%n", o, map.get(o));
    }
    System.out.printf("%nActive threads: %s%n", threadGroup.activeCount());
  }
}
