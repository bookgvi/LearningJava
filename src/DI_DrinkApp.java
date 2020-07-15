import DI_Drink.IDrinkAction;
import DI_Drink.IMakeChoice;
import DI_Drink.MyChoiceIsCoffee;
import DI_Drink.MyChoiceIsTea;

public class DI_DrinkApp {
  public static void main (String[] args) {
    String[] toppingsCommon = new String[]{"sugar"};
    String[] toppingsGourmet = new String[]{"sugar", "milk"};
    String[] toppingsCoffeeArab = new String[]{"sugar", "cardamom", "salt", "pepper"};
    String[] toppingsEmpty = new String[]{};
    IDrinkAction action;

    IMakeChoice tea = new MyChoiceIsTea(toppingsCommon);
    action = tea.makeChoice();
    action.process();

    IMakeChoice coffee;
    coffee = new MyChoiceIsCoffee(toppingsEmpty);
    action = coffee.makeChoice();
    action.process();

    coffee = new MyChoiceIsCoffee(toppingsGourmet);
    action = coffee.makeChoice();
    action.process();

    coffee = new MyChoiceIsCoffee(toppingsCoffeeArab);
    action = coffee.makeChoice();
    action.process();
  }
}
