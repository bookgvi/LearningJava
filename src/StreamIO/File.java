package StreamIO;

import java.io.*;

public class File implements FileIO {

  @Override
  public void getFromFile(String fileName) {
    try {
      InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName));
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      String line = bufferedReader.readLine();
      System.out.print("From file: \n");
    while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (IOException fileEx) {
      fileEx.printStackTrace();
    }
  }

  @Override
  public void writeToFile(String fileName, InputStream inputStream) {
    try (FileWriter fileWriter = new FileWriter(fileName)) {
      InputStreamReader systemInput = new InputStreamReader(inputStream != null ? inputStream : System.in);
      BufferedReader bufferedReader = new BufferedReader(systemInput);
      String str = bufferedReader.readLine();
      fileWriter.write(str);
    } catch (IOException fileEx) {
      fileEx.printStackTrace();
    }
  }

}
