package tmp_DDD;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPoolManager;
import oracle.jvm.hotspot.jfr.Producer;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public void tmpMethod() {
        AtomicReference<String> cache = new AtomicReference<>();
        Supplier<String> supplier = () -> "Hello";
        Consumer<String> consumer = cache::set;
        consumer.accept(supplier.get());

        ExecutorService es = new ThreadPoolExecutor(1,10, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(10);

        ScheduledExecutorService ses = new ScheduledThreadPoolExecutor(5);

        Class[] params = new Class[]{String.class, String.class};
    }
}
