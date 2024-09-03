public class CustomQueue {

  private int[] data;
  private static final int DEFAULT_SIZE = 10;

  int end = 0;

  public CustomQueue() {
    this(DEFAULT_SIZE);
  }

  public CustomQueue(int size) {
    this.data = new int[size];
  }

  public boolean push(int item) throws Exception {
    if (isFull()) {
      throw new Exception("Queue is full");
    }
    data[end] = item;
    end++;
    return true;
  }

  public int remove() throws Exception {
    if (isEmpty()) {
      throw new Exception("stack is empty");
    }
    int removedItem = data[0];
    for (int i = 1; i < end; i++) {
      data[i - 1] = data[i];
    }
    end--;
    return removedItem;
  }

  public boolean isFull() {
    return end == data.length;
  }

  public boolean isEmpty() {
    return end == 0;
  }

  public void display() {
    for (int i = 0; i < end; i++) {
      System.out.print(data[i] + " <- ");
    }
    System.out.println("END");
  }
}
