package LinkedList;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println(" END");
    }

    public void displayRev(){
        Node node = head;
        Node last = null;
        while (node != null) {
            last = node;
            node = node.next;
        }

        while (last != null) {
            System.out.print(last.val + " <- ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public void insertLast(int val){
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        node.next = null;
        node.prev = last;
        last.next = node;
    }

    public void insertAfterValue(int after, int val){
        Node findedNode = getFind(after);
        if (findedNode == null) {
            System.out.println("Node with value " + after + " not found.");
            return;
        }
        
        if (findedNode.next == null) {
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        findedNode.next.prev = node;
        node.next = findedNode.next;
        node.prev = findedNode;
        findedNode.next = node;
    }

    public Node getFind(int val){
        Node node = head;
        while (node != null && node.val != val) {
            node = node.next;
        }
        return node;
    }

    //

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node (int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
