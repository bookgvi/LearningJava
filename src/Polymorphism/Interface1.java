package Polymorphism;

public interface Interface1 {
  final String field = "QQQ1";
  final String firstName = "FirstName";
  final String lastName = "LastName";

  default String getName() { return firstName; };

  static String getLastName() {
    return lastName;
  }
}
