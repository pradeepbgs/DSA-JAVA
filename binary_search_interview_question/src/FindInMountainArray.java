// https://leetcode.com/problems/find-in-mountain-array/
// 1095. Find in Mountain Array

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(serch(arr,target));
    }

    static int serch(int[] arr, int target){
        int peak= peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }

        // else searh in second half
        return OrderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end-start) /2;
            if(arr[mid] > arr[mid+1]){
                // descending part of the array
                // this maybe the answer, but look at left
                end = mid;
            }else{
                start = mid+1; // because we know that mid+1 elemnt > mid element
            }
        }
        // in the end, start and end == pointing to the largest number
        // start and end are always trying to find max element in the above 2 checks
        // hence they are pointing to just one element that is max
        return start; // or return end , both are equal
    }

    static int OrderAgnosticBS(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start+ (end-start) / 2;

            if (target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }

        }
        return -1;
    }
}
