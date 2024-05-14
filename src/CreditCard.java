public class CreditCard extends IcCard {

  private static int counter = 1;

  public CreditCard(int wallet) {
    super(counter, wallet);
    counter++;
  }

  @Override
  public void topup(int value) {
    value = (int)Math.round((value * 1.1));
    super.topup(value);
  }


}
