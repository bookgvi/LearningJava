package MultiThread;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutors {
  private ExecutorService executor = Executors.newFixedThreadPool(Definitions.MAX_THREADS);
  private MultiThread.MyCallable myCallable = new MyCallable();

  public MyExecutors() {
    List<Future<String>> futures = new ArrayList<>();

    for (int i = 0; i < Definitions.MAX_THREADS; i++) {
      Future<String> future = executor.submit(myCallable);
      futures.add(future);
    }
    SimpleDateFormat sdf = new SimpleDateFormat();
    futures.forEach(future -> {
      try {
        System.out.printf("Date|time: %s; %n\t\t\t\t value: %s%n", sdf.format(new Date()), future.get());
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
    });
    executor.shutdown();
  }

}
