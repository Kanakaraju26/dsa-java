package binarysearch.bson1d;

public class  Search_in_Rotated_Sorted_Array_1 {
    public static int search(int[] nums, int target) {
        int left = 0;
       int right = nums.length - 1;

       while (left <= right) {
           int mid = left + (right - left) / 2;

           // Check if the target is at mid
           if (nums[mid] == target) {
               return mid;
           }

           // Determine which side is sorted
           if (nums[left] <= nums[mid]) {
               // Left side is sorted
               if (target >= nums[left] && target < nums[mid]) {
                   // Target is in the left side
                   right = mid - 1;
               } else {
                   // Target is in the right side
                   left = mid + 1;
               }
           } else {
               // Right side is sorted
               if (target > nums[mid] && target <= nums[right]) {
                   // Target is in the right side
                   left = mid + 1;
               } else {
                   // Target is in the left side
                   right = mid - 1;
               }
           }
       }

       // Target not found
       return -1;
   }
   public static void main(String[] args) {
    System.out.println(search(new int[]{2,3,4,5,1}, 1));
   }
}
