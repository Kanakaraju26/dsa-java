package slidingWindow.medium;

public class count_number_of_nice_subarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
   }

   private int atMostK(int[] nums, int k) {
       int count = 0; // Count of valid subarrays
       int left = 0;  // Left pointer of the sliding window
       int oddCount = 0; // Number of odd numbers in the current window
       
       for (int right = 0; right < nums.length; right++) {
           // If nums[right] is odd, increment oddCount
           if (nums[right] % 2 != 0) {
               oddCount++;
           }
           
           // If oddCount exceeds k, shrink the window from the left
           while (oddCount > k) {
               if (nums[left] % 2 != 0) {
                   oddCount--;
               }
               left++;
           }
           
           // Add the number of subarrays ending at 'right'
           count += (right - left + 1);
       }
       
       return count;
   }
}
