import java.util.ArrayList;
import java.util.List;

/**
 * FindDisapperedNumbers
 */
public class FindDisapperedNumbers {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(disappredNumbers(arr));
    }

    static List<Integer> disappredNumbers(int[] arr){
        cyclic(arr);
        List<Integer> missingNumbers = new ArrayList<>();
        for(int i =0; i < arr.length; i++){
            if (arr[i] != i + 1){
                missingNumbers.add(i+1);
            }
        }
        return missingNumbers;
    }

    static void cyclic(int[]arr){
        int i =0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else i++;
        }
    }

    static void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}