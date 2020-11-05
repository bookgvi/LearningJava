import MultiThread.*;

import static java.lang.Thread.sleep;

public class MultiThread {
  public static void main(String[] args) throws InterruptedException {
    ThreadGroup threadGroup = new ThreadGroup("QQQ");
    ConcurrentObj concurrentObj = new ConcurrentObj();
    Thread myThread;
    for (int i = 1; i <= 5; i++) {
      myThread = new Thread(new MyThread(threadGroup, concurrentObj));
      myThread.setName("myThread" + i);
    }
  }
}
