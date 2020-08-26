package GenericConstructor;

public interface IClient {
  String getName();
  Short getAge();
  Integer getHeight();

  <X> void setAttr (X i);
}
