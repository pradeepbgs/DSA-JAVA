/**
 * Happy
 */
public class Happy {

  public static void main(String[] args) {}

  static Boolean isHappy(int n) {
    int slow = n;
    int fast = n;

    do {
      slow = findSq(slow);
      fast = findSq(findSq(fast));
    } while (slow != fast);

    if (slow == 1) {
      return true;
    }
    return false;
  }

  static int findSq(int n) {
    int ans = 0;
    while (n > 0) {
      int rem = n % 10;
      ans += rem * rem;
      n = n / 10;
    }
    return ans;
  }
}
