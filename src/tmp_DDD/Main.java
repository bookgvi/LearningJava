package tmp_DDD;

import oracle.jvm.hotspot.jfr.Producer;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public void tmpMethod() {
        AtomicReference<String> cache = new AtomicReference<>();
        Supplier<String> supplier = () -> "Hello";
        Consumer<String> consumer = cache::set;
        consumer.accept(supplier.get());
    }
}
