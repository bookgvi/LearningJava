import Polymorphism.*;

public class Polymorphism {
  final public static void main(String[] args) {
    ChildClass childClass = new ChildClass();
    System.out.printf("Out: %s%n", ((Interface2) childClass).field);
    System.out.printf("Out: %s%n", childClass.getName());
    System.out.printf("Out: %s%n", Interface1.getLastName());
  }
}
