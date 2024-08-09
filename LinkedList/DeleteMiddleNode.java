/**
 * DeleteMiddleNode
 */

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

public class DeleteMiddleNode {

  public static void main(String[] args) {
    ListNode head = new ListNode(3);
    head.next = new ListNode(2);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(-4);
    head.next.next.next.next = new ListNode(10);
    head.next.next.next.next.next = new ListNode(20);
    head = deleteMiddle(head);

    // Print the updated list
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  static ListNode deleteMiddle(ListNode head) {
    if (head == null || head.next == null) {
      head = null;
      return null;
    }

    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = null;
    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    prev.next = slow.next;
    return head;
  }
}
