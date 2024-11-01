package binarysearch.bsonans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Allocate_Books {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n) return -1;
        int left = Collections.max(arr);
        int right = arr.stream().mapToInt(Integer::intValue).sum();
        int res = -1;

        while (left<=right) {
            int mid = left + (right - left)/2;
            int students = countstd(arr,mid,m);
            if(students<=m){
                res = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return res;
    }
    private static int countstd(ArrayList<Integer> arr,int mid, int m){
        int std = 1;
        int page = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(page + arr.get(i) > mid){
                std++;
                page = arr.get(i);
            }else page+= arr.get(i);
        }
        return std;
    }
    public static void main(String[] args) {
        System.out.println(findPages(new ArrayList<>(Arrays.asList(2,4,5,7,8,9)), 6, 5));
    }
}
