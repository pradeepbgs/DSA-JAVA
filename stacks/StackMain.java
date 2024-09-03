public class StackMain {
    public static void main(String[] args) throws  Exception{
        CustomStack customStack = new CustomStack();
        customStack.push(22);
        customStack.push(33);
        customStack.push(55);
        customStack.push(1000);

        System.out.println(customStack.peak());
        System.out.println(customStack.pop());
    }
}
