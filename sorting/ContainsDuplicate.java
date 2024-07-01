
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,1,3,5,6,7,8,8};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }

    static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        cyclic(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != i+1) {
                return true;
            }
        }

        return false;
    }

    static void cyclic(int[] nums){
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i ,correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap (int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
