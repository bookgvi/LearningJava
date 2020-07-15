import DI_Click.ButtonClickAction;
import DI_Click.IActionService;
import DI_Click.IConsumerAction;

public class DI_ClickApp {
  public static void main (String[] args) {
    IConsumerAction consumerAction = new ButtonClickAction();
    IActionService btn = consumerAction.getConsumer();
    btn.press();
  }
}
