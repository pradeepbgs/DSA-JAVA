package LinkedList;

public class RemoveDupFromDLL {
    class Node {
        int data ;
        Node next,prev;
        Node(int x){
            this.data = x;
            this.prev = null;
            this.next = null;
        }
    }
    class Solution{
        Node removeDuplicates(Node head){
            if (head == null){
                return null;
            }
           
           Node temp = head;
           
           while (temp != null && temp.next != null){
               if (temp.data == temp.next.data){
                   if (temp.next != null){
                   temp.next = temp.next.next;
                   }
                   if (temp.next != null){
                   temp.next.prev = temp;
                   }
               } else {
                    temp = temp.next;
               }
           }
           return head;
        }
    }
}
