import StreamIO.File;

import java.io.OutputStream;

public class StreamIO {
  public static void main(String[] args) {
    File file = new File();
    file.writeToFile("/Users/bookgvi/IdeaProjects/LearningJava/files/file1.txt", (OutputStream) null);
  }
}
