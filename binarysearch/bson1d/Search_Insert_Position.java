package binarysearch.bson1d;

public class Search_Insert_Position {
    public static int searchInsert(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int mid = -1;
        while(left<=right){
            mid = left + (right - left)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) left = mid+1;
            else right = mid - 1;
        }
        return left;
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {2,3,4,5,6,7},8));
    }
}
