package InheritanceReflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Square extends Shape {
  private final String shapeClassField = "QQQ";

  public String getSomeVar() {
    return this.someVar;
  }

  public void checkProperties() throws ClassNotFoundException {
    Class<?> squareClass = Class.forName(Square.class.getName());
    Square square = this.createSquareObj(squareClass);
    Field[] declaredFields = squareClass.getDeclaredFields();
    Field[] fields = squareClass.getFields();

    System.out.printf("SuperClass: %s%n", squareClass.getSuperclass().getName());
    System.out.printf("Declared fields count: %s%n", declaredFields.length);
    this.showFiledsInfo(declaredFields, square);
    System.out.printf("Fields count: %s%n", fields.length);
    this.showFiledsInfo(fields, square);
  }

  private void showFiledsInfo(Field[] fields, Object obj) {
    if (fields.length > 0) {
      Arrays.stream(fields).forEach(field -> {
        try {
          System.out.printf("Name: %s, type: %s, modifiers: %s, value = %s%n",
            field.getName(),
            field.getType().getName(),
            Modifier.toString(field.getModifiers()),
            field.get(obj)
          );
        } catch (Exception ignored) {
        }
      });
    } else {
      System.out.println("Empty...");
    }
  }

  private Square createSquareObj(Class<?> clazz) {
    Square square = null;
    Class[] params = new Class[] {};
    try {
      square = (Square) clazz.getConstructor(params).newInstance();
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
      e.printStackTrace();
    }
    return square;
  }
}
