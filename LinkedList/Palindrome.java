/**
 * Palindrome
 */
public class Palindrome {

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

  public Boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }
    ListNode mid = middleNode(head);
    ListNode secondHead = reverseList(mid);

    ListNode reverseHead = secondHead;

    while (head != null && secondHead != null) {
      if (head.val != secondHead.val) {
        return false;
      }
      head = head.next;
      secondHead = secondHead.next;
    }
    return true;
  }
}
