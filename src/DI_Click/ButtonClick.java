package DI_Click;

public class ButtonClick implements IClickHandlerService {
  @Override
  public void click() {
    System.out.println("Button clicked...");
  }
}
