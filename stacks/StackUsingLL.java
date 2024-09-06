/**
 * StackUsingLL
 */
public class StackUsingLL {

  class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node top;

  public StackUsingLL() {
    top = null;
  }

  public void push(int data) {
    Node temp = new Node(data);
    temp.next = top;
    top = temp;
  }

  public int pop() throws Exception {
    if (isEmpty()) {
      throw new Exception("Stack is empty");
    }
    int removedItem = top.data;
    top = top.next;
    return removedItem;
  }

  public int peek() {
    return top.data;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
