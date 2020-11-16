package Polymorphism;

public interface Interface2 {
  final String field = "QQQ2";
  default String getName() { return field; };
}
