public class Main2 {
  public static void main(String [] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();
    Cow cow = new Cow();
    SmallDog sDog = new SmallDog();
    Toy toy = new Toy();
    toy.makeSound(dog);
    toy.makeSound(cat);
    toy.makeSound(cow);
    toy.makeSound(sDog);

  }
}
