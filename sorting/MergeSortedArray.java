import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {1,2,2,3,5,6};
        int ans[] = merge(arr1, arr1.length, arr2, arr2.length);
        System.out.println(Arrays.toString(ans));
    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] c = new int[m+n];
        int i = 0 , j =0 , k = 0;
        
        while (i<m && j<n ) {
            if (nums1[i] <= nums2[j]) {
                // c[k] = nums1[i];
                // i++;
                // k++;
                // or we can write it like 
                c[k++] = nums1[i++];
            } else {
                // c[k] = nums2[j];
                // j++;
                // k++;
                c[k++] = nums2[j++];
            }
        }

        // for (; i< m; i++) {
        //     c[k] = nums1[i];
        //     k++;
        // }
        // for (; j< n; j++) {
        //     c[k] = nums2[j];
        //     k++;
        // }

        while (i<m && nums1[i] != 0) {
            c[k++] = nums1[i++];
        } 
        while (j<n && nums2[j] != 0) {
            c[k++] = nums2[j++];
        }

        return c;
    }
}
