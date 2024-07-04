import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,-32,0,78,1}; 
        selection_sort(arr);   
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr){
       for (int i = 0; i < arr.length-1; i++) {
         int lastIndex = arr.length-i-1;
         int maxIndex = getMaxIndex(arr, 0, lastIndex);
         swap(arr, maxIndex, lastIndex);
       }
    }

    static int getMaxIndex (int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max] ) {
                max = i;
            }
        }
        return max;
    }

    static void swap (int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
