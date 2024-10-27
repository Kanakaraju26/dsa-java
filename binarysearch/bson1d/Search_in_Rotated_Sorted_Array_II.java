package binarysearch.bson1d;

public class Search_in_Rotated_Sorted_Array_II {
    public static boolean search(int[] nums, int target) {
        int left = 0;
       int right = nums.length - 1;

       while (left <= right) {
           int mid = left + (right - left) / 2;

           // Check if the target is at mid
           if (nums[mid] == target) {
               return true;
           }

           // If we have duplicates, just shrink the bounds
           if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
               left++;
               right--;
           } 
           // Left half is sorted
           else if (nums[left] <= nums[mid]) {
               if (target >= nums[left] && target < nums[mid]) {
                   right = mid - 1; // Search in the left half
               } else {
                   left = mid + 1; // Search in the right half
               }
           } 
           // Right half is sorted
           else {
               if (target > nums[mid] && target <= nums[right]) {
                   left = mid + 1; // Search in the right half
               } else {
                   right = mid - 1; // Search in the left half
               }
           }
       }

       return false;
   }
   public static void main(String[] args) {
    System.out.println(search(new int[]{4,5,6,7,8,1,2,3}, 1));
   }
}
