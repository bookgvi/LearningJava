package DI_Drink;

public class MyChoiceIsTea implements IMakeChoice {
  private String[] toppings;

  public MyChoiceIsTea (String[] toppings) {
    this.toppings = toppings;
  }

  @Override
  public IDrinkAction makeChoice () {
    return new DrinkAction(new DrinkTea(toppings));
  }
}
