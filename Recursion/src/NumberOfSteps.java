/**
 * NumberOfSteps
 */
public class NumberOfSteps {
    // static int counter = 0;
    public static void main(String[] args) {
        // count(14);
        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int num) {
        return helper(num,0);
    }

    static  int helper(int n, int s){
        if (n == 0) {
            return s;
        }

        if (n % 2 ==0) {
            return helper(n/2, s+1);
        }
        return helper(n-1, s+1);
    }


    // we can do like this too but we have to make an int var to store steps and steps++ it.

    // static void count(int n){
    //     if (n == 0) {
    //         return;
    //     }

    //     if (n % 2 == 0) {
    //         counter++;
    //         count(n/2);
    //     }
    //     else if (n %2 != 0) {
    //         counter++;
    //         count(n-1);
    //     }
    // }
}
