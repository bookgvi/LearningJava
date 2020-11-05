package MultiThread;

import static java.lang.Thread.sleep;

public class MyThread implements Runnable {
  private Thread thread;
  private ConcurrentObj obj;

  public MyThread(ThreadGroup threadGroup, ConcurrentObj obj) {
    thread = new Thread(threadGroup, this);
    this.obj = obj;
    System.out.printf("Created additional thread: %s%n", thread.getName());
    thread.start();
  }

  @Override
  public void run() {
    for (int i = 1; i <= 5; i++) {
//      System.out.printf("HasTable size: %s (%s)%n", obj.getChm().size(), thread.getName());
      System.out.printf("Value: %s, (%s)%n", obj.getHm().putIfAbsent(i, i), thread.getName());
      try {
        sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
