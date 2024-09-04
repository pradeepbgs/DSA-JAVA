public class DynamicCircularQ extends CircularQueue{

  public DynamicCircularQ() {
    super();
  }

  public DynamicCircularQ(int size) {
    super(size);
  }
  @Override
  public boolean insert(int item) throws Exception {
    if (this.isFull()) {
      // double the array size
      int[] temp = new int[data.length * 2];
      // copy all prev items in new
      for (int i = 0; i < data.length; i++) {
        temp[i] = data[(front + i) % data.length ];
      }
      front =0;
      end = data.length;
      data = temp;
    }
    // insert item
    return super.insert(item);
  }
}
