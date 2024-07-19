package LinkedList;

public class MiddleOfLinkedList {

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode middleNode(ListNode head) {
        int count =0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        
        ListNode node = head;
        for (int i = 0 ; i<count/2; i++){
            node = node.next;
        }
        return node;
    }
}
