public class Floor {
    public static void main(String[] args) {
        int[]arr = {5,8,9,11,15,19,24};
        int target = 14;
        System.out.println("index no." +floor(arr,target));
    }

    static int floor(int[] nums, int target){
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
        return end;
    }
}
