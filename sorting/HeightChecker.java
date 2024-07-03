import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }

    static int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        insertion(expected);
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(expected));
        int count = 0;
        for (int i =0 ; i <heights.length;i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else break;
            }
        }
    }

    static void swap(int[]arr, int first, int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
