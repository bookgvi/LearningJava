package GenericConstructor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client<T, U, V> implements IClient {
  private String name = "-";
  private Short age = 0;
  private Integer height = 0;

  public Client (T a, U b, V c) {
    this.setAttr(a);
    this.setAttr(b);
    this.setAttr(c);
  }

  @Override
  public String getName () {
    return name;
  }

  @Override
  public Short getAge () {
    return age;
  }

  @Override
  public Integer getHeight () {
    return height;
  }

  private <X> void setAttr(X a) {
    if (a.getClass().toString().contains("String")) {
      name = (String) a;
    } else if (a.getClass().toString().contains("Short")) {
      age = (Short) a;
    } else {
      height = (Integer) a;
    }
  }
}
