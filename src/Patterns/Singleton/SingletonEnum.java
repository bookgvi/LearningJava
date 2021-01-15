package Patterns.Singleton;

public enum SingletonEnum {
  INSTANCE("This is SingletonEnum.class (enum) - INSTANCE1"),
  INSTANCE2;
  private String info = "QQQ";

  SingletonEnum(String info) {
    this.info = info;
  }

  SingletonEnum() {
  }

//   В методе нет необходимости
//  public SingletonEnum getInstance() {
//    return INSTANCE;
// //    return INSTANCE2;
// //    return INSTANCE3;
//  }

  public String getInfo() {
    return this.info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}
