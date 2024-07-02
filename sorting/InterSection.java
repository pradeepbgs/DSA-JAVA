import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterSection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ans = new ArrayList<>();

        for (int i=0; i<nums1.length;i++){
            if (nums1[i] == nums2[i]) {
                ans.add(nums1[i]);
                break;
            }
        }



        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
