public class CustomStack {

  protected int[] data;
  private static final int DEFAULT_SIZE = 10;

  int ptr = -1;

  boolean isFull = false;

  public CustomStack() {
    this(DEFAULT_SIZE);
  }

  public CustomStack(int size) {
    this.data = new int[size];
  }

  public boolean push(int item) throws Exception {
    if (isFull()) {
      throw new Exception("Stack is full");
    }
    ptr++;
    data[ptr] = item;
    return true;
  }

  public int pop() throws Exception {
    if (isEmpty()) {
      throw new Exception("Stack is empty");
    }
    int removed = data[ptr];
    ptr--;
    return removed;
  }

  public int peak() throws Exception {
    if (isEmpty()) {
      throw new Exception("Stack is empty");
    }
    return data[ptr];
  }

  public boolean isFull() {
    return ptr == data.length - 1;
  }

  public boolean isEmpty() {
    return ptr == -1;
  }
}
