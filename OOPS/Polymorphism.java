class MathOperations {

  public int add(int a, int b) {
    return a + b;
  }

  // Method to add two doubles
  public double add(double a, double b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b - c;
  }
}

public class Polymorphism {

  public static void main(String[] args) {
    MathOperations math = new MathOperations();
    System.out.println(math.add(1, 2));

    System.out.println(math.add(1, 2, 3));
    System.out.println(math.add(5.5, 6.6));
  }
}
