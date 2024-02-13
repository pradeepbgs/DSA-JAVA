//  https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// 744. Find Smallest Letter Greater Than Target

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println("Smallest letter greater than " + target + " is: " + smallestLetter(arr, target));
    }

    static char smallestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        if (target >= arr[end]) {
            return arr[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
