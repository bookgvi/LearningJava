package StreamIO;

import java.io.*;
import java.util.ArrayList;

public class File implements FileIO {
  private final int BUFFER_CAPACITY = 5;

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
    try(FileWriter fileWriter = new FileWriter(fileName)) {
      InputStreamReader systemInput = new InputStreamReader(System.in);
      BufferedReader bufferedReader = new BufferedReader(systemInput);
      String str = bufferedReader.readLine();
      fileWriter.write(str);
    } catch (IOException fileEx) {
      fileEx.printStackTrace();
    }
    System.out.println();
  }

  @Override
  public void writeToFile(String fileName, Writer outputCharStream) {
  }
}
