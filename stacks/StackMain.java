public class StackMain {

  public static void main(String[] args) throws Exception {
    DynamicStack customStack = new DynamicStack();
    customStack.push(22);
    customStack.push(33);
    customStack.push(55);
    customStack.push(1000);
    customStack.push(1000);
    customStack.push(1000);
    customStack.push(1000);
    customStack.push(1000);
    customStack.push(1000);
    customStack.push(1000);
    customStack.push(1000);
    customStack.push(1000);

    System.out.println(customStack.peak());
    System.out.println(customStack.pop());
  }
}
