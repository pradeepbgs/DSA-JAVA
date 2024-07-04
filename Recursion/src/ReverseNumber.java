import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
        reverse(1234);
        System.out.println(rev2(sum));
    }

    static int sum = 0;
    static void reverse(int n){
        if (n == 0) {
            return ;
        }
        int lastDigits = n % 10;
        sum = sum * 10 + lastDigits;
         reverse(n/10);
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
        return rem * (int)(Math.pow(10, digits-1)) + helper(num/10, digits);
    }

}
