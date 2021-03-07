package Threads;

import java.util.concurrent.*;

public class Threads {
    static CountDownLatch countDownLatch = new CountDownLatch(1);
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Thread1());
        System.out.printf("Main thread \"%s\" start\n", Thread.currentThread().getName());
//        t1.start();
        System.out.printf("Child thread \"%s\" start\n", t1.getName());
//        t1.join();

        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(10);
        ExecutorService executor = new ThreadPoolExecutor(2, 2, 1000, TimeUnit.MILLISECONDS, workQueue);
        executor.submit(new Thread1());
        executor.shutdown();
        countDownLatch.await();
        System.out.printf("\nMain thread %s finish its work\n", Thread.currentThread().getName());
    }

    public static class Thread1 implements Runnable {
        CountDownLatch countDownLatch = Threads.countDownLatch;
        @Override
        public void run() {
            final int MAX = 19;
            for (int i = 0; i < MAX; i++) {
                System.out.printf("%s\t", i);
            }
            countDownLatch.countDown();
        }
    }
}
