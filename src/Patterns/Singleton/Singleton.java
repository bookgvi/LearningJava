package Patterns.Singleton;

import java.io.Serializable;

public final class Singleton implements Serializable {
  public static Singleton INSTANCE;
  private String info = "This is Singleton.class";

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (Singleton.INSTANCE == null) {
      Singleton.INSTANCE = new Singleton();
    }
    return Singleton.INSTANCE;
  }

  public String getInfo() {
    return this.info;
  }
}
