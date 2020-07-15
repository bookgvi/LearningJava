package DI_Click;

public class ButtonClickAction implements IConsumerAction {
  @Override
  public IActionService getConsumer () {
    return new Action(new ButtonClick());
  }
}
