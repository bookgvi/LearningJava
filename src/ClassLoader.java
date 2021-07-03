import ClassLoader.*;
import ClassLoader.initalization_order.Child;
import ClassLoader.initalization_order.Parent;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;

public class ClassLoader {
  public static void main(String[] args) throws FileNotFoundException {
    Child inst = new Child();
    inst.nonStaticMethod();
    String res = inst.staticMethod();
    System.out.println(res);
  }
}
