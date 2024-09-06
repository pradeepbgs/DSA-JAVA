/**
 * QusingLL
 */
public class QusingLL {

  class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node front;
  Node rear;

  public QusingLL() {
    front = null;
    rear = null;
  }

  public void push(int data) {
    Node temp = new Node(data);
    if (rear == null) {
      front = temp;
      rear = temp;
    } else {
      rear.next = temp;
      rear = temp;
    }
  }

  public int pop() {
    if (front == null) {
      return -1;
    }
    int removed = front.data;
    front = front.next;

    if (front == null) {
      // if queue become null after pop
      rear = null;
    }
    return removed;
  }
}
