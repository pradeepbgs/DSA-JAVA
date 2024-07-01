import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(nums));
        
    }
    static List<Integer> findDuplicate(int[] arr) {
        cyclic(arr);
        List<Integer> duplicateNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                // if (arr[i] != i + 1 && !duplicateNumbers.contains(arr[i]) ) 
                // we can do like this also
                duplicateNumbers.add(arr[i]);
            }
        }
        return duplicateNumbers;
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