package DI_Drink;

public class DrinkAction implements IDrinkAction {
  private IDrinkService service;
  DrinkAction (IDrinkService service) {
    this.service = service;
  }
  @Override
  public void process () {
    service.drink();
  }
}
