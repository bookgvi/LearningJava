package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
  private List<Integer> intList = new ArrayList<Integer>();

  public StreamAPI(int arraySize) {
    for(int item = 1; item <= arraySize; item++) {
      intList.add(new Random().nextInt(10));
    }
  }

  public Stream<Integer> getStream() {
    return intList.stream();
  }

  public void square(ArrayList<Integer> arr) {
    IntStream stream = arr != null ? arr.stream().mapToInt(i -> i) : this.intList.stream().mapToInt(i -> i);
    stream.map(i -> i*i).mapToObj(i -> i + " ").forEach(System.out::print);
  }

  public void optional() {
    Optional optional = Optional.of(this.intList);
    System.out.printf(String.valueOf(optional.isPresent()));
  }
}
