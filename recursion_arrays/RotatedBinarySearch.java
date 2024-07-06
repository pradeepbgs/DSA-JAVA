package recursion_arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3,4};
        int target = 4;
        System.out.println(Rotatedsearch(arr, target,0, arr.length-1));
    }

    static int Rotatedsearch(int[] arr, int target, int start, int end){
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return Rotatedsearch(arr, target, start, mid-1);
            }
            return Rotatedsearch(arr, target, mid+1, end);
        } else {
            if (target >= arr[mid] && target <= arr[end]) {
                return Rotatedsearch(arr, target, start, mid-1);
            }
            return Rotatedsearch(arr, target, mid+1, end);
        }

    }
}
