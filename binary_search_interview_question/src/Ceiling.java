public class Ceiling {
    public static void main(String[] args) {
        int[]arr = {5,8,9,11,15,19,24};
        int target = 10;
        System.out.println("index no." +ceiling(arr,target));
    }

    static int ceiling(int[] nums, int target) {

        if(target > nums[nums.length-1]){
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
