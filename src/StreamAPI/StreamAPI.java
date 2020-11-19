package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
  private List<Integer> intList = new ArrayList<Integer>();

  public StreamAPI(int arraySize) {
    for(int item = 1; item <= arraySize; item++) {
      intList.add(item);
    }
  }

  public Stream<Integer> getStream() {
    return intList.stream();
  }

  public void square(ArrayList<Integer> arr) {
    IntStream stream = arr != null ? arr.stream().mapToInt(i -> i) : new Random().ints();
    stream.map(i -> i*i).forEach(System.out::print);
  }
}
