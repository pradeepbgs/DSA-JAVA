// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// 852. Peak Index in a Mountain Array ,

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(search(arr));
    }

    static int search(int[] arr){
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
}
