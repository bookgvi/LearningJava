package DI_Drink;

public class DrinkCoffee implements IDrinkService {
  @Override
  public void drink () {
    System.out.println("Drink cup of coffee");
  }
}
