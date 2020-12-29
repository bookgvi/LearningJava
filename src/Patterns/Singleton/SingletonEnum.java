package Patterns.Singleton;

public enum SingletonEnum {
  INSTANCE("This is SingletonEnum.class (enum) - INSTANCE1"),
  INSTANCE2,
  INSTANCE3("This is SingletonEnum.class (enum) - INSTANCE3");
  private String info = "QQQ";

  SingletonEnum(String info) {
    this.info = info;
  }

  SingletonEnum() {

  }

  public SingletonEnum getInstance() {
    return INSTANCE;
//    return INSTANCE2;
//    return INSTANCE3;
  }

  public String getInfo() {
    return this.info;
  }
  public void setInfo(String info) {
    this.info = info;
  }
}
