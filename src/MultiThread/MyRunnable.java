package MultiThread;

import java.util.Map;
import java.util.Objects;
import java.util.Random;

import static java.lang.Thread.sleep;


public class MyRunnable implements Runnable {
  private Map<Integer, String> map;
  private String name = Thread.currentThread().getName();
  private boolean isActive = true;

  public MyRunnable(boolean isActive, Map<Integer, String> map) {
    this.isActive = isActive;
    this.map = map;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  private void fillHashMap(int index, Map<Integer, String> map) throws InterruptedException {
    if (index > ConcurrentObj.MAP_SIZE) return;
    if (map.get(index) == null) {
      map.putIfAbsent(index, this.name);
      notifyAll();
    }
    fillHashMap(++index, map);
  }

  private void concurrentFillHashMap(Map<Integer, String> map) throws InterruptedException {
    int index = new Random().nextInt(ConcurrentObj.MAP_SIZE);
    map.putIfAbsent(index, this.name);
    sleep(1);
  }


  @Override
  public void run() {
    this.name = Thread.currentThread().getName();
    System.out.printf("Created additional thread: %s%n", this.name);
    while (this.isActive) {
      try {
        this.concurrentFillHashMap(map);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
