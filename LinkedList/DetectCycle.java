class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

class DetectCycle {

  public static void main(String[] args) {
    ListNode head = new ListNode(3);
    head.next = new ListNode(2);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(-4);
    head.next.next.next.next = head.next; // Creating a cycle for testing

    System.out.println(cycle(head)); // Should print true
  }

  static Boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;

    while (slow != fast) {
      if (fast.next == null || fast == null) {
        return false;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }

  static int lengthOfCycle(ListNode head) {
    if (head == null || head.next == null) {
      return 0;
    }
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (slow == fast) {
        int length = 0;
        ListNode temp = slow;
        do {
          temp = temp.next;
          length++;
        } while (slow != temp);
        return length;
      }
    }

    return 0;
  }

  // find the where the cycle is starting , detect the cycle
  static ListNode cycle(ListNode head) {
    int length = 0;

    ListNode slow = head;
    ListNode fast = head;
    System.out.println(length);
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast) {
        length = lengthOfCycle(slow);
        System.out.println(length);
        break;
      }
    }
    if (length == 0) {
      return null;
    }
    // find the start node
    ListNode first = head;
    ListNode second = head;
    while (length > 0) {
      second = second.next;
      length--;
    }
    // keep moving both f s that they can meet at starting point
    while (first != second) {
      first = first.next;
      second = second.next;
    }
    System.out.println(first);
    return first;
  }
}
