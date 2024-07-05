public class Palindrome {
    public static void main(String[] args) {
        System.out.println(PalindromeNumber(1));
    }

    static int rev2(int num){
        int digits = (int)(Math.log10(num) + 1);
        return helper(num,digits);
    }

    static int helper(int num,int digits){
        if (num%10 == num) {
            return num;
        }
        int rem = num % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(num/10, digits-1);
    } 

    static boolean PalindromeNumber(int n){
        return n == rev2(n);
    }
}
