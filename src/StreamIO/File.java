package StreamIO;

import java.io.*;
import java.util.ArrayList;

public class File implements FileIO {
  private final int BUFFER_CAPACITY = 100;

  @Override
  public InputStream readByteStreamFromFile(String fileName) {
    return null;
  }

  @Override
  public Reader readCharStreamFromFile(String fileName) {
    try {
      java.io.FileReader file = new java.io.FileReader("/Users/bookgvi/IdeaProjects/LearningJava/files/file1.txt");
      BufferedReader bufferedReader = new BufferedReader(file);
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    return null;
  }

  @Override
  public void writeToFile(String fileName, OutputStream outputStream) {
    int i = 0;
    ArrayList<Character> charBufExt = new ArrayList<>();
    char[] charBuf = new char[BUFFER_CAPACITY];
    try(FileWriter fileWriter = new FileWriter(fileName)) {
      InputStreamReader systemInput = new InputStreamReader(System.in);
      BufferedReader bufferedReader = new BufferedReader(systemInput);
      int buffeSize = bufferedReader.read(charBuf);
      while(i < buffeSize) {
        fileWriter.write(charBuf[i]);
        System.out.printf("%s", charBuf[i]);
        i++;
      }
    } catch (IOException fileEx) {
      fileEx.printStackTrace();
    }
    System.out.println();
  }

  @Override
  public void writeToFile(String fileName, Writer outputCharStream) {
  }
}
