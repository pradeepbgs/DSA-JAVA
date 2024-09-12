class Animal {

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void eat() {
    System.out.println("This animal eats food.");
  }
}

class Dog extends Animal {

  @Override
  public void eat() {
    super.eat();
    System.out.println("The dog eats bones. and his name is: " + this.getName());
  }
}

public class Inheritance {

  public static void main(String[] args) {
    Animal a = new Animal();
    a.setName("Tiger");
    System.out.println(a.getName());

    Dog dog = new Dog();
    dog.setName("Husky");
    dog.eat();
  }
}
