/**
 * MiddleOfLL
 */
class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

public class MiddleOfLL {

  public static void main(String[] args) {}

  static ListNode middleNode(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null || fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    head = slow;
    return head;
  }
}
