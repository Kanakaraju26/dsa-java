package hashing;

import java.util.Arrays;

public class Frequency_of_the_Most_Frequent_Element {
    public static void main(String[] args) {
        int[] nums = {4,2,5,2,9,2};
        int k = 4;

         Arrays.sort(nums);
        
        int left = 0;
        long totalOperations = 0;
        int maxFrequency = 1;

        // Sliding window approach
        for (int right = 1; right < nums.length; right++) {
            // Calculate the number of operations needed to make all elements in the window equal to nums[right]
            totalOperations += (long) (nums[right] - nums[right - 1]) * (right - left);
            
            // If the number of operations exceeds k, shrink the window from the left
            while (totalOperations > k) {
                totalOperations -= nums[right] - nums[left];
                left++;
            }
            
            // Update the maximum frequency
            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }
        
        System.out.println(maxFrequency); 
    }
}
