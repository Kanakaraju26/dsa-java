package slidingWindow.easy;

import java.util.HashSet;

public class maximum_sum_of_distinct_subarrays_with_length_k {
    public long maximumSubarraySum(int[] nums, int k) {
     long maxSum = 0;  // To store the maximum sum of valid subarrays
        long currentSum = 0;  // To store the sum of the current window
        int start = 0;  // Start of the sliding window
        HashSet<Integer> set = new HashSet<>();  // To track distinct elements in the window

        for (int end = 0; end < nums.length; end++) {
            // If the current element is already in the set, shrink the window from the start
            while (set.contains(nums[end])) {
                currentSum -= nums[start];
                set.remove(nums[start]);
                start++;
            }

            // Add the current element to the set and update the current sum
            set.add(nums[end]);
            currentSum += nums[end];

            // If the window size equals k, check for maximum sum
            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                // Shrink the window to check for the next subarray
                currentSum -= nums[start];
                set.remove(nums[start]);
                start++;
            }
        }

        return maxSum; 
    }
}
