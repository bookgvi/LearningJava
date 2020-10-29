import Inheritance.Square;

import java.lang.reflect.InvocationTargetException;

public class InheritanceApp {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
    Square square = new Square();
    System.out.printf("%s%n", square.getSomeVar());
    square.checkProperties();
  }
}
