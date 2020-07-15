package DI_Drink;

public class MyChoiceIsTea implements IMakeChoice {
  @Override
  public IDrinkAction makeChoice () {
    return new DrinkAction(new DrinkTea());
  }
}
