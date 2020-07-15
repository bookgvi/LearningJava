package DI_Drink;

public class MyChoiceIsCoffee implements IMakeChoice {
  @Override
  public IDrinkAction makeChoice () {
    return new DrinkAction(new DrinkCoffee());
  }
}
