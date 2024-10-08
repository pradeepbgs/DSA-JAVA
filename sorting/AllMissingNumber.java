import java.util.ArrayList;
import java.util.List;

public class AllMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(FindAllMissingNumber(arr));
    }

    static List<Integer> FindAllMissingNumber(int[]arr){
        cyclic(arr);
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
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
    
    static void swap(int[]arr, int first, int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
