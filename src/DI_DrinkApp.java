import DI_Drink.IDrinkAction;
import DI_Drink.IMakeChoice;
import DI_Drink.MyChoiceIsCoffee;
import DI_Drink.MyChoiceIsTea;

public class DI_DrinkApp {
  public static void main (String[] args) {
    IDrinkAction action = null;

    IMakeChoice tea = new MyChoiceIsTea();
    action = tea.makeChoice();
    action.process();

    IMakeChoice coffee = new MyChoiceIsCoffee();
    action = coffee.makeChoice();
    action.process();
  }
}
