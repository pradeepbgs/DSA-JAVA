public class FIndDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        cyclic(nums);
        for (int i =0; i<nums.length;i++){
            if (nums[i] != i + 1){
                return nums[i];
            }
        }
        return nums.length+1;
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

    static void swap (int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}