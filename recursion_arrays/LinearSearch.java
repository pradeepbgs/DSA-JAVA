package recursion_arrays;

import java.util.ArrayList;

/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        // System.out.println(search(arr, 4, 0));
        // System.out.println(searchLast(arr, 4, arr.length-1));
        FindAllIndex(arr, 7, 0);
        System.out.println(list);
    }
   
    static int search(int[] arr,int target,int index){
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } 
        return search(arr,target,index+1);
    }

    static int searchLast(int[] arr,int target,int index){
        if (index <= -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } 
        return search(arr,target,index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>(); 
    static void FindAllIndex(int[] arr,int target,int index){
        if (index >= arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        } 
         FindAllIndex(arr,target,index+1);
    }
}