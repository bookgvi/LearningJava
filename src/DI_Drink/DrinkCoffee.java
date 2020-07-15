package DI_Drink;

public class DrinkCoffee implements IDrinkService {
  String drink = "coffee";
  private String[] toppings;

  DrinkCoffee (String[] toppings) {
    this.toppings = toppings;
  }

  @Override
  public void drink () {
    int toppingsCount = toppings.length;
    System.out.printf("Drink cup of %s", drink);
    if (toppingsCount > 0) {
      System.out.print(" with");
      for (int i = 0; i < toppingsCount; i++) {
        String comma = i == toppingsCount - 1 ? "" : ",";
        comma = i == toppingsCount - 2 ? " and" : comma;
        System.out.printf(" %s%s", toppings[i], comma);
      }
    }
    System.out.println();
  }
}
