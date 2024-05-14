public class TrafficCard extends IcCard {

  private static int counter = 1;
  public TrafficCard(int value) {
    super(counter, value);
    counter++;
  }

  @Override
  public void topup(int value) {
    value = (int)Math.round((value * 1.2));
    super.topup(value);
  }
}
