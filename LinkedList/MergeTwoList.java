/**
 * MergeTwoList
 */

class ListNode {

  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class MergeTwoList {

  public static void main(String[] args) {}

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // we have merge two list so , first we create a new dummy list
    // where we will store our merged list
    ListNode dummmy = new ListNode();
    ListNode s = list1;
    ListNode f = list2;
    ListNode current = dummmy;
    while (s != null && f != null) {
      if (s.val < f.val) {
        current.next = s;
        s = s.next;
      } else {
        current.next = f;
        f = f.next;
      }
      current = current.next;
    }

    // if one list is remaining so joing dummn.next to remain list node thats it
    if (s != null) {
      current.next = s;
    } else {
      current.next = f;
    }

    return dummmy.next;
  }
}
