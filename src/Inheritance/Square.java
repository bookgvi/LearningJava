package Inheritance;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Square extends Shape {
  private String shapeClassField;

  public String getSomeVar() {
    return this.someVar;
  }

  public void checkProperties() throws ClassNotFoundException {
    Class squareClass = Class.forName(Square.class.getName());
    Field[] declaredFields = squareClass.getDeclaredFields();
    Field[] fields = squareClass.getFields();

    System.out.printf("SuperClass: %s%n", squareClass.getSuperclass().getName());
    System.out.printf("Declared fields count: %s%n", declaredFields.length);
    if (declaredFields.length > 0) {
      Arrays.stream(declaredFields).forEach(field -> {
        System.out.println(field.getName());
      });
    }
    System.out.printf("Fields count: %s%n", fields.length);
    if (fields.length > 0) {
      Arrays.stream(fields).forEach(field -> {
        System.out.println(field.getName());
      });
    }
  }
}
