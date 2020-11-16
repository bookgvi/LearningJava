import NestedClasses.Request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class NestedClass_Builder {
  public static void main(String[] args) throws IOException {
    Request request = Request.newRequest().setUrl("http://ya.ru").setMethod("GET").build();
    InputStream response = request.send();
    byte[] bytesArr = new byte[0];
    int count = response.read(bytesArr);
    BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(response));
    System.out.printf("GET: %s%n");
    System.out.printf("Count: %s%n", count);
  }
}
