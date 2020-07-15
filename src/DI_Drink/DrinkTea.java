package DI_Drink;

public class DrinkTea implements IDrinkService {
  @Override
  public void drink() {
    System.out.println("Drink cup of tea...");
  }
}
