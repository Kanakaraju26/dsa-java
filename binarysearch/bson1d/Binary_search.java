package binarysearch.bson1d;

public class Binary_search {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) left=mid+1;
            else right = mid -1; 
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{3,5,6,8,9}, 9));
    }
}
