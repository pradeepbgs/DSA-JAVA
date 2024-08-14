/**
 * ReverseLL
 */
public class ReverseLL {

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

  // recursive Reverse LL
  public void reverse(ListNode node) {
    if (ListNode == tail) {
      head = tail;
      return;
    }
    reverse(node.next);
    tail.next = node;
    tail = node;
    tail.next = null;
  }
}
