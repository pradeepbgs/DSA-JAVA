// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

// 34. Find First and Last Position of Element in Sorted Array

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        // check for first occurence of the target
//        int start = search(nums, target, true);
//        int last = search(nums, target, false);
//        ans[0] = start;
//        ans[1] = last;

            ans[0] = search(nums, target, true);
            if(ans[0] != -1){
                ans[1]  = search(nums,target, false);
            }
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else{
                // potential answer has been found
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
