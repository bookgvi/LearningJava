import Patterns.Decorator.FileRW;
import Patterns.Singleton.Singleton;
import Patterns.Singleton.SingletonEnum;

public class Patterns {
  public static void main(String[] args) {
    SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
    Singleton singleton = Singleton.getInstance();
    System.out.println(singletonEnum.getInfo());
    System.out.println(singleton.getInfo());

    String text = "Some text string for file";
    String fileName = "temp.file";
    FileRW fileRW = new FileRW(fileName);
    fileRW.writeToFile(text);
    System.out.printf("From file %s: %s%n", fileName, fileRW.readFromFile());
  }
}
