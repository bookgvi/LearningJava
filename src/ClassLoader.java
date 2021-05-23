import ClassLoader.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;

public class ClassLoader {
  public static void main(String[] args) throws FileNotFoundException {
    TestClass testClass = new TestClass();
    System.out.printf("TestClass classLoader: %s%n", testClass.getClass().getClassLoader());
//    System.out.printf("Object classLoader: %s%n", Object.class.getClassLoader());
//    System.out.printf("System classLoader: %s%n", java.lang.ClassLoader.getSystemClassLoader().getName());


    System.out.printf("%s%n", Child.name);
    System.out.printf("%s%n", Child.name1);
  }
}
