public class Main3 {
  public static void main(String [] args){

    CreditCard credCard = new CreditCard(100);
    TrafficCard traCard = new TrafficCard(200);
    Machine machine = new Machine();

    machine.pay(credCard);
    System.out.println(credCard.getWallet());

    machine.pay(traCard);
    System.out.println(traCard.getWallet());

    DepositMachine depositMachine = new DepositMachine();
    depositMachine.deposit(credCard,300);
    System.out.println(credCard.getWallet());

  }
}
