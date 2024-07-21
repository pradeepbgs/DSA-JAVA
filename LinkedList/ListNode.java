package LinkedList;

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 


 class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode f = list1;
        ListNode s = list2;

        ListNode current = dummy;

        while (f!=null && s!=null){
            if (f.val < s.val){
                current.next = f;
                f = f.next;
            } else {
                current.next = s;
                s = s.next;
            }
            current = current.next;
        }
        if (f != null) {
            current.next = f;
        } else {
            current.next = s;
        }

        return dummy.next;
    }
}