package easy;

import java.util.ArrayList;
import java.util.TreeSet;

public class Union_of_Two_Sorted_Arrays {

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m)
    {
        // add your code here
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            set.add(arr2[j]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:set){
            arr.add(i);
        }
        return arr;
       
    }
    public static void main(String[] args) {
        int[] arr1 = {3,6,8,9,9};
        int[] arr2 = {1,2,3,4,5};
         
        ArrayList<Integer> arr = findUnion(arr1, arr2, 5, 5);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
