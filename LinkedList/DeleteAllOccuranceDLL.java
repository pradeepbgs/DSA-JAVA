package LinkedList;

public class DeleteAllOccuranceDLL {
    class Node {
        int data;
        Node next,prev;
        Node(int x){
            this.data = x;
            this.next = null;
            this.prev = null;
        }
    }
    
    class Solution {
        static Node deleteAllOccurOfX(Node head, int x) {
             while (head != null && head.data == x) {
                head = head.next;
            }
            
            Node temp = head;
            
            while (temp != null){
                if (temp.data == x){
                    if (temp.next !=null){
                    temp.next.prev = temp.prev;
                    }
                    if (temp.prev != null){
                    temp.prev.next = temp.next;
                    }
                }
                    temp = temp.next;
            }
            return head;
        }
    }
}
