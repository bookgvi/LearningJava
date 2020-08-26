import GenericConstructor.Client;
import GenericConstructor.IClient;

public class GenericConstructorApp {
  public static void main(String[] args) {
    Short age = 18;
    String name = "Bill";
    Integer height = 185;
    IClient person = new Client<>(age, name, name);
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());
    System.out.println("Height: " + person.getHeight());
  }
}
