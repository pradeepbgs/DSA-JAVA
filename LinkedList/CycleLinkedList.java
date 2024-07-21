package LinkedList;

class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
        }
}


public class CycleLinkedList {

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head == null){
                return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
    
            while (slow != fast) {
                if (fast == null || fast.next == null) {
                    return false; // If fast reaches the end (null), no cycle exists
                }
                slow = slow.next; // Move slow pointer one step
                fast = fast.next.next; // Move fast pointer two steps
            }
            return true;
        }
    }
}