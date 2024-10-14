package medium;

import java.util.ArrayList;
import java.util.Collections;

public class Array_Leaders {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> lst = new ArrayList<>();
        int max = -1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                lst.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(lst);
        return lst;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ArrayList<Integer> arr = leaders(6,new int[] {78,45,99,23,12,66});
    }
}
