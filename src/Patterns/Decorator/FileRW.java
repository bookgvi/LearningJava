package Patterns.Decorator;

import java.io.*;

public class FileRW implements FileActions {
  private String fileName;

  public FileRW(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public String readFromFile() {
    char[] buffer = new char[0];
    File fileDescriptor = new File(fileName);
    try (FileReader fileReader = new FileReader(fileDescriptor)) {
      buffer = new char[(int) fileDescriptor.length()];
      fileReader.read(buffer);
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    }
    return new String(buffer);
  }

  @Override
  public void writeToFile(String str) {
    File fileDescriptor = new File(fileName);
    try (OutputStream fos = new FileOutputStream(fileDescriptor)) {
      fos.write(str.getBytes(), 0, str.length());
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    }
  }
}
