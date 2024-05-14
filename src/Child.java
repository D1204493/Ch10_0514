public class Child extends Parent {

//  public void sayHi() {
//    System.out.println("Hello Everyone");
//  }


  @Override
  public void sayHi() {
    super.sayHi();
    System.out.println("Hello Everyone");
  }

  public void play() {
    System.out.println("I am playing...");
  }



}
