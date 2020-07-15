import InterfaceAsCallback.Button;
import InterfaceAsCallback.ClickHandler;

public class InterfaceCBApp {
  public static void main (String[] args) {
    Button btn = new Button(new ClickHandler());
    btn.click();
    btn.click();
  }
}
