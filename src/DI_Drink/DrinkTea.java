package DI_Drink;

public class DrinkTea extends DrinkCoffee {

  DrinkTea (String[] toppings) {
    super(toppings);
    super.drink = "tea";
  }

  @Override
  public void drink () {
    super.drink();
  }
}
