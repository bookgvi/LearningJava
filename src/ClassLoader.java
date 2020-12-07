import ClassLoader.*;

public class ClassLoader {
  public static void main(String[] args) {
    TestClass testClass = new TestClass();
    System.out.printf("TestClass classLoader: %s%n", testClass.getClass().getClassLoader().getName());
    System.out.printf("Object classLoader: %s%n", Object.class.getClassLoader());
    System.out.printf("System classLoader: %s%n", java.lang.ClassLoader.getSystemClassLoader().getName());
  }
}
