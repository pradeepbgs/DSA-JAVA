
public class Main {

    public static void main(String[] args) {
        // print1(1);
        // print(10);
        // int ans =  factorial(5);
        System.out.println(sumOfNumber(0));
        // fun(5);
    }

    static void print1(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        print1(n+1);
    }

    static void print(int n) {
        if(n >= 1){
            print(n-1);
            System.out.println(n);
        }
    }

    static int factorial(int n){
        if (n >= 2){
            int ans =  n * factorial(n-1);
            return ans;
        } 
        return 1;
    }

    static int fibonacci(int n){
        if (n > 1) {
            return fibonacci(n-1) + fibonacci(n-2); 
        }
        return n; 

        // or we can do like this tooo.
        // if (n < 2){ return n}
        // return fibonacci(n-1) + fibonacci(n-2);
    }


    static void fun(int n){
        if (n == 0) {
            return ;
        }
         fun(n-1);
        System.out.println(n);
    }

    static int sumOfNumber(int n){
        if (n <= 1) {
            return n;
        }
        return n + sumOfNumber(n-1);
    }




    // Time Complexity: O(n)
    // Space Complexity: O(n

}