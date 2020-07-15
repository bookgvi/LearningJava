package InterfaceAsCallback;

import static java.lang.System.out;

public class ClickHandler implements IExecute {
  @Override
  public void execute () {
    out.println("Button has been clicked...");
  }
}
