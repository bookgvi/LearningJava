package StreamIO;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public interface FileIO {
  InputStream readByteStreamFromFile(String fileName);
  Reader readCharStreamFromFile(String fileName);
  void writeToFile(String fileName, OutputStream outputStream);
  void writeToFile(String fileName, Writer outputCharStream);
}
