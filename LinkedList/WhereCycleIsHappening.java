package LinkedList;

public class WhereCycleIsHappening {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public int hasCycle(ListNode head) {
            if (head ==null) {
                return;
            }

            ListNode slow = head;
            ListNode fast = head;
            ListNode temp = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                while (temp != slow) {
                    temp = temp.next;
                    slow = 
                }
            }

        }
    }
}
