package LinkedList;

public class Main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertFirst(3);
        // list.insertFirst(5);
        // list.insertFirst(7);
        // list.insertFirst(9);
        // list.insertFirst(22);
        // list.insertLast(999);
        // list.insert(1000, 3);
        // list.display();
        // System.out.println(list.deleteFirst());
        // System.out.println(list.deleteLast());
        // System.out.println(list.delete(2));
        // list.display();
        // System.out.println(list.find(5));
        // list.display();


        // DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(5);
        // list.insertFirst(7);
        // list.insertFirst(9);
        // list.insertLast(100);
        // list.insertAfterValue(7, 70);
        // list.display();
        // list.displayRev();


        CLL list = new CLL();
        list.insert(1);
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
        list.delete(30);
        list.display();


    }
}
