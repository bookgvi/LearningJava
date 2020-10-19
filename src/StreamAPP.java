import StreamAPI.StreamAPI;

import java.util.stream.Stream;

public class StreamAPP {
  public static void main(String[] args) {
    StreamAPI counts = new StreamAPI(15);

    Stream<Integer> countStream = counts.getStream();

    countStream.filter(i -> i % 2 == 0).forEach(System.out::println);
  }
}
