/**
 * ReorderList
 */
public class ReorderList {

  public static void main(String[] args) {}

  public ListNode reverseList(ListNode head) {
    ListNode present = head;
    ListNode prev = null;

    while (present != null) {
      ListNode next = present.next;
      present.next = prev;
      // now mover forward evryone
      prev = present;
      present = next;
    }
    return prev;
  }

  public ListNode middleNode(ListNode head) {
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

  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }
    ListNode mid = middleNode(head);
    ListNode hs = reverseList(mid);
    ListNode hf = head;

    while (hf != null && hs != null) {
      ListNode temp1 = hs.next;
      hf.next = hs;
      hf = temp1;

      temp1 = hs.next;
      hs.next = hf;
      hs = temp1;
    }

    if (hs != null) {
      hf.next = null;
    }
  }
}
