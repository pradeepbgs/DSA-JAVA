import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,0,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[]arr){
        int i =0;
        while (i < arr.length) {
            int correct = arr[i];
            if (correct >= 0 && correct < arr.length && arr[i] != arr[correct]) {
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
