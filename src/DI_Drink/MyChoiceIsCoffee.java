package DI_Drink;

public class MyChoiceIsCoffee implements IMakeChoice {
  private String[] toppings;
  public MyChoiceIsCoffee(String[] toppings) {
    this.toppings = toppings;
  }
  @Override
  public IDrinkAction makeChoice () {
    return new DrinkAction(new DrinkCoffee(toppings));
  }
}
