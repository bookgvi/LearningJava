package StreamIO;

import java.io.*;

public class ReadFile {
  private String fileName;
  private static int BUFFER_SIZE = 8196;

  ReadFile() {}
  public ReadFile(String fileName) {
    this.fileName = fileName;
  }

  public void readFileToConsole() throws IOException {
    byte[] buffer = new byte[BUFFER_SIZE];
    FileInputStream fis = new FileInputStream(this.fileName);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis));
    int i;
    while ((i = fis.read(buffer)) != -1) {
      System.out.write(buffer, 0, i);
    }
  }
}
