package LinkedList;

public class LengthOfSLL {

    class Node{
        int data;
        Node next;
        Node(int a){  data = a; next = null; }
    }


    public int getCount(Node head) {
        if(head == null){
            return 0;
        }
        
        Node temp = head;
        int count =0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
     }
}
