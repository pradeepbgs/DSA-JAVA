/**
 * QueueMain
 */
public class QueueMain {

  public static void main(String[] args) throws Exception {
    CustomQueue qu = new CustomQueue();
    // qu.push(11);
    qu.push(10);
    qu.push(9);
    qu.push(8);
    qu.push(7);
    qu.push(6);
    qu.push(5);
    qu.push(4);
    qu.push(3);
    qu.push(2);
    qu.push(1);

    System.out.println(qu.remove());
    System.out.println(qu.remove());
    qu.display();
  }
}
