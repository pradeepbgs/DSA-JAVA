/**
 * Concept
 */
public class Concept {

    public static void main(String[] args) {
        func(5);
    }

    static void func(int n){
        if (n ==0) {
            return;
        }

        System.out.println(n);
        // func(n--);
        // this is not work becuse n = n-1 means func pass only n value first the 
        // substract it so it will create a loop call and memory exceed
        // the correct method is --n;
        func(--n);
    }
}