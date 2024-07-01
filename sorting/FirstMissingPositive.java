public class FirstMissingPositive {
    public static void main(String[] args) {
        
    }

    static int firstMissingPositive(int[] nums) {
        cyclic(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return nums.length+1;
    }

    static void cyclic(int[] nums){
        int i =0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
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
