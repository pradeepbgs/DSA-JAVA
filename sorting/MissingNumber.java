
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,2,0,1};
        int ans = cyclic(arr);
        System.out.println(ans);
    }

    static int cyclic(int[]arr){
        int i =0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else i++;
        }
        // search for missing number

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        } 

        // case 2 

        return arr.length;
    }


    static void swap(int[]arr, int first, int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
