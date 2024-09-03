/**
 * DynamicStack
 */
public class DynamicStack extends CustomStack {

  public DynamicStack() {
    super(); //it will call customStack()
  }

  public DynamicStack(int size) {
    super(size); // it will call DynamicStack(int size)
  }

  @Override
  public boolean push(int item) throws Exception {
    if (this.isFull()) {
      // double the array size
      int[] temp = new int[data.length * 2];
      // copy all prev items in new
      for (int i = 0; i < data.length; i++) {
        temp[i] = data[i];
      }

      data = temp;
    }
    // insert item
    return super.push(item);
  }
}
