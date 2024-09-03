package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*
 Arrays.sort()
 Collections.reverse()
 */


public class CollectionsExample {
    public static void main(String[] args) {
        // Arrays.sort()
        int[] arr = new int[3];
        int[] arr1 = {3,1,4};
        for (int i = 0; i < arr.length; i++) {
            arr[i]  =  arr1[i];
        }
        Arrays.sort(arr);
        // for (int i : arr) {
        //     System.out.println(i);  //1,3,4
        // }

        List<Integer> arr2 = new ArrayList<>();
        for (int i : arr) {
            arr2.add(i);
        }
        Collections.reverse(arr2);
        // for (int i : arr2) {
        //     System.out.println(i);  // 4,3,1
        // }
    }
}
