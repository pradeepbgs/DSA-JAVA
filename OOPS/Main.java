class Car {

  String model;
  int price;
  String brand;

  public Car(String model, int price, String brand) {
    this.model = model;
    this.price = price;
    this.brand = brand;
  }

  public void display() {
    System.out.println("Brand: " + this.brand + " Model: " + this.model + " and final price: " + this.price);
  }
}

public class Main {

  public static void main(String[] args) {
    Car car1 = new Car("F32", 300000, "Toyota");
    Car car2 = new Car("H55", 2020, "Honda");
    car1.display();
    car2.display();
  }
}
