package StreamIO;

import java.io.InputStream;

public interface FileIO {
  void getFromFile(String fileName);
  void writeToFile(String fileName, InputStream inputStream);
}
