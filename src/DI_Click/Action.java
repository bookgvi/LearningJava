package DI_Click;

public class Action implements IActionService {
  private IClickHandlerService service;

  public Action (IClickHandlerService click) {
    this.service = click;
  }

  @Override
  public void press () {
    service.click();
  }
}
