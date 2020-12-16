package Concurrent.AtomicClasses;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

public class SequenceGenerator {
  static final int THREADS_COUNT = 5;
  static final int SEQUENCE_SIZE = 10;

  static class SeqGen {
    AtomicReference<BigInteger> seqGen;
    final BigInteger MULTIPLIER = BigInteger.valueOf(2);
    static SeqGen instance;

    private SeqGen () {
      seqGen = new AtomicReference<>(BigInteger.ONE);
    }

    static SeqGen getInstance() {
      if (instance == null) instance = new SeqGen();
      return instance;
    }

    BigInteger next () {
      BigInteger next;
      BigInteger value;
      do {
        value = seqGen.get();
        next = value.multiply(MULTIPLIER);
      } while (!seqGen.compareAndSet(value, next));
      return value;
    }
  }

  static class Sequence implements Runnable {

    List<BigInteger> sequence = new ArrayList<>();
    SeqGen seqGen;

    Sequence () {
      seqGen = SeqGen.getInstance();
    }

    @Override
    public void run () {
      for (int i = 0; i < SEQUENCE_SIZE; i++) {
        sequence.add(seqGen.next());
        try {
          Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.printf("Thtead %s, finished %n", Thread.currentThread().getName());
      printSequence();
    }

    private void printSequence () {
      String delimiter = ", ";
      int index = 0;
      System.out.printf("Массив потока %s: ", Thread.currentThread().getName());
      System.out.print("[");
      for (BigInteger item : sequence) {
        delimiter = index == sequence.size() - 1 ? "" : delimiter;
        System.out.printf("%s%s", String.valueOf(item), delimiter);
        index++;
      }
      System.out.print("]\n");
    }
  }

  public void runMe () {
    for (int i = 0; i < THREADS_COUNT; i++) {
      new Thread(new Sequence()).start();
    }
  }
}
