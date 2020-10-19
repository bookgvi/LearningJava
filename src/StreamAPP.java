import StreamAPI.StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPP {
  public static void main(String[] args) {
    StreamAPI counts = new StreamAPI(15);
    Stream<Integer> countStream = counts.getStream();
    countStream.filter(i -> i % 2 == 0).forEach(System.out::println); // Выводим четные числа


    String first = "First";
    String second = null;
    String third = "Third";
    String fourth = "Fourth";

    String[] numbers = new String[]{first, second, third, fourth};

    Arrays.stream(numbers)
      .filter(Objects::nonNull)
      .map(item -> item + "; ")
      .forEach(System.out::print);

    System.out.println();

    List<String> numbersNotNull = IntStream.range(0, numbers.length)
      .filter(index -> numbers[index] != null)
      .mapToObj(i -> numbers[i])
      .collect(Collectors.toList());
    int len = numbersNotNull.size();

    IntStream.range(0, len)
      .mapToObj(index -> {
        if (index < len - 1) numbersNotNull.set(index, numbersNotNull.get(index) + "; ");
        return numbersNotNull.get(index);
      })
      .forEach(System.out::print);
  }
}
