public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    static int reverse(int n){
        if (n % 10 == n) {
            return n;
        }
        int lastDigits = n % 10;

        return lastDigits + reverse(n/10);
    }
}
