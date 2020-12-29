package Patterns.Singleton;

public enum SingletonEnum {
  INSTANCE("This is SingletonEnum.class (enum)");
  private String info;

  SingletonEnum(String info) {
    this.info = info;
  }

  public SingletonEnum getInstance() {
    return INSTANCE;
  }

  public String getInfo() {
    return this.info;
  }
  public void setInfo(String info) {
    this.info = info;
  }
}
