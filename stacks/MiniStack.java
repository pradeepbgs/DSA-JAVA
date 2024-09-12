public class MiniStack {

  protected int[] data;
  protected int[] minStack;
  private static final int DEFAULT_SIZE = 10;
  int ptr = -1;
  int minPtr = -1;

  public MiniStack() {
    this(DEFAULT_SIZE);
  }

  public MiniStack(int size) {
    this.data = new int[size];
    this.minStack = new int[size];
  }

  public boolean push(int item) {
    if (isFull()) {
      return false;
    }
    data[++ptr] = item;
    if (minPtr == -1 || item < minStack[minPtr]) {
      minStack[++minPtr] = item;
    }
    return true;
  }

  public int pop() {
    if (isEmpty()) {
      return -1;
    }
    int removed = data[ptr--];
    if (removed == minStack[minPtr]) {
      minPtr--;
    }
    return removed;
  }

  public int top() {
    if (isEmpty()) {
      return -1;
    }
    return data[ptr];
  }

  // suppose we have - 1,2,4,5,-2,0,4,2,8
  public int mini() {
    if (isEmpty()) {
      return -1;
    }
    return minStack[minPtr];
  }

  public boolean isEmpty() {
    return ptr == -1;
  }

  public boolean isFull() {
    return ptr == data.length - 1;
  }
}
