package LinkedList;


public class DeleteNodeInDublyLL {

    class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

    public static void main(String[] args) {
        
    }

    public Node deleteNode(Node head, int x) {
        if (head == null) {
            return null; // List is empty
        }
        Node temp = head;
        for (int i=1 ; i<x;i++){
            temp=temp.next;
        }
        if (temp == head){
            head = head.next;
            if(head != null){
                head.prev = null;
            }
        }
        if (temp.prev != null){
        temp.prev.next = temp.next;
        }
        if (temp.next != null){
        temp.next.prev = temp.prev;
        }
        return head;
    }
}
