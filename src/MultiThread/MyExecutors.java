package MultiThread;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class MyExecutors {

  public MyExecutors() {
    Object s = new int[]{1, 2};
    int i2;
    String s1 = (String) new Object();
    s1 = "QQQ";
    s = "QQQ";
//    i2 = "QQQ";
    Executor ex = Executors.newFixedThreadPool(10);
    ExecutorService executor = Executors.newFixedThreadPool(Definitions.MAX_THREADS);
    MultiThread.MyCallable myCallable = new MyCallable();
    List<Future<String>> futures = new ArrayList<>();
    List<MyRunnable> myRunnableList = new ArrayList<>();
    Map<Integer, String> map = ConcurrentObj.getMap(true);

    for (int i = 0; i < Definitions.MAX_THREADS; i++) {
      MyRunnable myRunnable = new MyRunnable(true, map);
      myRunnableList.add(myRunnable);
      Future<String> future = executor.submit(myCallable);
      executor.submit(myRunnable);
      futures.add(future);
    }

    // Результат callable
    SimpleDateFormat sdf = new SimpleDateFormat();
    System.out.println("Callable threads:");
    futures.forEach(future -> {
      try {
        System.out.printf("Date|time: %s; %n\t\t\t\t value: %s%n", sdf.format(new Date()), future.get());
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
    });

    // Результат runnable
    System.out.println("\nRunnable tasks:");
    map.keySet().forEach(key -> {
      System.out.printf("%s: %s%n", key, map.get(key));
    });

    // Close runnable tasks
    myRunnableList.forEach(task -> task.setActive(false));

    executor.shutdown();
  }

}
