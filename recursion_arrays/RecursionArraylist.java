package recursion_arrays;

import java.util.ArrayList;

public class RecursionArraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = FindAllIndex(arr, 4, 0, list);
        System.out.println(FindIndexes(arr, 4, 0));
    }
    
    static ArrayList<Integer> FindAllIndex(int[] arr,int target,int index, ArrayList<Integer> list){
        if (index >= arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        } 
         return FindAllIndex(arr,target,index+1, list);
    }

    // now we have to return the arrayList without taking it in argument;

    static ArrayList<Integer> FindIndexes(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index >= arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        } 
         ArrayList<Integer> ansfrombelowcalls =  FindIndexes(arr,target,index+1);
         list.addAll(ansfrombelowcalls);
         return list;
    }
}
