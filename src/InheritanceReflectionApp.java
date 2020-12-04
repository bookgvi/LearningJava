import InheritanceReflection.Square;

import java.lang.reflect.InvocationTargetException;

public class InheritanceReflectionApp {
  public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    int x = 1234567890;
    float y = x;
    System.out.print("\n\nint x = 1234567890; \nfloat y = x;\n");
    System.out.printf("x = %s, y = x -> %s%n%n%n", x, y);
    Square square = new Square();
    System.out.printf("%s%n", square.getSomeVar());
    square.checkProperties();

  }
}
