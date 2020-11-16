package Polymorphism;

public interface Interface2 {
  final String field = "QQQ1";
  final String firstName = "FirstName";

  default String getName() { return firstName; };
}
