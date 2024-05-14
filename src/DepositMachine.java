public class DepositMachine {

  public void deposit(IcCard card,int money) {
    card.topup(money);
  }

}
