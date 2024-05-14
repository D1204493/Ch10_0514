public class IcCard {
  private int id;
  private int wallet;

  public IcCard(int id, int wallet) {
    this.id = id;
    this.wallet = wallet;
  }

  public int getId() {
    return id;
  }

  public int getWallet() {
    return wallet;
  }

  public void topup(int value){
    this.wallet += value;
  }

  boolean withdraw(int value) {
    if (this.wallet >= value){
      this.wallet -= value;
      return true;
    }
    return false;
  }



}
