package InterfaceAsCallback;

public class Button {
  private IExecute action;

  public Button (IExecute action) {
    this.action = action;
  }

  public void click() {
    this.action.execute();
  }
}
