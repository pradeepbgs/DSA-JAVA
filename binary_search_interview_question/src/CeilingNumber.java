public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    // return the index of smallest no >= target
    static int ceiling(int[] nums, int target){
        if(target > nums[nums.length-1]){
            return -1;
        }
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end - start) /2;

            if(nums[mid] == target){
                return mid;
            } else if (target < nums[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
