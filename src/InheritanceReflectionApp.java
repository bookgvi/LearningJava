import InheritanceReflection.Square;

public class InheritanceReflectionApp {
  public static void main(String[] args) throws ClassNotFoundException {
    Square square = new Square();
    System.out.printf("%s%n", square.getSomeVar());
    square.checkProperties();
  }
}
