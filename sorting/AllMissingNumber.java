public class AllMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(AllMissingNumber(arr));
    }

    static int AllMissingNumber(int[]arr){
        cyclic(arr);
        int[] newArr = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                newArr[] = {i+1}
            }
        }
        return arr.length+1;
    }

    static void cyclic(int[]arr){
        int i =0;
        while (i < arr.length) {
            int correct = arr[i];
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
