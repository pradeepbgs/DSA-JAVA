// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findErrorNums(int[] arr) {
        cyclic(arr);
        int[] newArray = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1){
                newArray[0] = arr[i];
                newArray[1] = i+1;
            }
        }
        return newArray;                             
    }

    static void cyclic(int[] nums){
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i ,correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[]arr, int first, int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
