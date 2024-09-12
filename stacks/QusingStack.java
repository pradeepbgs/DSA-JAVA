import java.util.Stack;

/**
 * QusingStack
 */
public class QusingStack {

  private Stack<Integer> first;
  private Stack<Integer> second;

  public QusingStack() {
    first = new Stack<>();
    second = new Stack<>();
  }

  //this is add efficiency
  public void add(int item) {
    first.push(item);
  }

  public int pop() {
    while (!first.isEmpty()) {
      second.push(first.pop());
    }

    int removedItem = second.pop();
    while (!second.isEmpty()) {
      first.push(second.pop());
    }
    return removedItem;
  }

  public boolean isEmpty() {
    return first.isEmpty();
  }

  public int peek() {
    while (!first.isEmpty()) {
      second.push(first.pop());
    }

    int peeked = second.peek();
    while (!second.isEmpty()) {
      first.push(second.pop());
    }
    return peeked;
  }

  // now with remove efficiency
  public void add(int item) {
    while (!first.isEmpty()) {
      second.push(first.pop());
    }
    first.push(item);
    while (!second.isEmpty()) {
      first.push(second.pop());
    }
  }

  public int pop() {
    return first.pop();
  }

  public int peek() {
    return first.peek();
  }
}
