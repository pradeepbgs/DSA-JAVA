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
            ListNode fast = head;
            
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        // find length of the cycle 

        public int lengthCycle(ListNode head) {
            if(head == null){
                return 0;
            }
            ListNode slow = head;
            ListNode fast = head;
            
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    // calculate the length of cycle
                    ListNode temp = slow;
                    int length =0;
                    do {
                        temp = temp.next;
                        length++;
                    } while (slow != temp);
                    return length;
                }
            }
            return 0;
        }

    }
}