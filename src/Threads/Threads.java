package Threads;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Thread1());
        System.out.printf("Main thread \"%s\" start\n", Thread.currentThread().getName());
        t1.start();
        System.out.printf("Child thread \"%s\" start\n", t1.getName());
        t1.join();
        System.out.printf("\nMain thread %s finish its work\n", Thread.currentThread().getName());
    }

    public static class Thread1 implements Runnable {
        @Override
        public void run() {
            final int MAX = 19;
            for (int i = 0; i < MAX; i++) {
                System.out.printf("%s\t", i);
            }
        }
    }
}
