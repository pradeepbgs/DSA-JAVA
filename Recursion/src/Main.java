/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // print1(1);
        // print(10);
        // int ans =  factorial(0);
        System.out.println(fibonacci(6));
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
        if (n >= 1){
            int ans =  n * factorial(n-1);
            return ans;
        } 
        return -1;
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

}