package MultiThread;

import java.util.Map;

public class MyThread implements Runnable {
  private Map<Integer, String> map;
  private String name = Thread.currentThread().getName();

  public MyThread(ThreadGroup threadGroup, Map<Integer, String> map) {
    this.map = map;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    this.name = Thread.currentThread().getName();
    System.out.printf("Created additional thread: %s%n", this.name);
    fillHashMap(0, map);
  }

  private void fillHashMap(int index, Map<Integer, String> map) {
    if (index > 4) return;
    if (map.get(index) == null) {
      map.putIfAbsent(index, this.name);
    }
    fillHashMap(++index, map);
  }
}
