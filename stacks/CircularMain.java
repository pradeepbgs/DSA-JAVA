public class CircularMain {
    public static void main(String[] args) throws Exception{
        CircularQueue circularQueue = new CircularQueue();

        circularQueue.insert(10);
        circularQueue.insert(20);
        circularQueue.insert(30);
        circularQueue.insert(40);
        circularQueue.insert(50);
        circularQueue.insert(60);
        circularQueue.insert(70);
        circularQueue.insert(80);
        circularQueue.insert(90);
        circularQueue.insert(100);

        circularQueue.display();
        circularQueue.remove();
        circularQueue.insert(11);
        circularQueue.display();
    }
}
