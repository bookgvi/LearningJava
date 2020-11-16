package Polymorphism;

public interface Interface1 {
  final String field = "QQQ1";
  default String getName() { return field; };
}
