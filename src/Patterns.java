import Patterns.Singleton.Singleton;
import Patterns.Singleton.SingletonEnum;

public class Patterns {
  public static void main(String[] args) {
    SingletonEnum singletonEnum = SingletonEnum.INSTANCE.getInstance();
    Singleton singleton = Singleton.getInstance();
    System.out.println(singletonEnum.getInfo());
    System.out.println(singleton.getInfo());
  }
}
