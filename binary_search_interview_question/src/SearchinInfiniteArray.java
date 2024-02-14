public class SearchinInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,23,55,70};
        int target = 8;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie on the range

        while (target > arr[end]){
            int newStart = end +1;
            // double the box value means double the end position
            // end  = previous end +
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }
    static int search (int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end-start) /2;

            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
