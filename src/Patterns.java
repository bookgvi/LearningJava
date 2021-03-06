import Patterns.Decorator.EncriptData;
import Patterns.Decorator.FileActions;
import Patterns.Decorator.FileRW;
import Patterns.Singleton.Singleton;
import Patterns.Singleton.SingletonEnum;

enum MySingleton {
  INSTANCE;
  MySingleton() {
    System.out.println("Enum constructor");
  }
}

public class Patterns {

  public static void main(String[] args) {
//    SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
//    Singleton singleton = Singleton.getInstance();
//    System.out.println(singletonEnum.getInfo());
//    System.out.println(singleton.getInfo());
//
//    System.out.println();
//
//    String text = "Some text string for file";
//    String fileName = "temp.file";
//    FileActions fileRW = new FileRW(fileName);
//    fileRW.writeToFile(text);
//    System.out.printf("From file %s:%n %s%n", fileName, "\t" + fileRW.readFromFile());
//
//    FileActions encFileRW = new EncriptData(fileRW);
//    encFileRW.writeToFile(text);
//    System.out.printf("From encrypted file %s:%n %s%n", fileName, "\t" + encFileRW.readFromFile());

    System.out.println(MySingleton.INSTANCE);
  }
}
