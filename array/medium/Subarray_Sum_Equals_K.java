package medium;

import java.util.HashMap;

public class Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        // Map to store the cumulative sum and its frequency
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int count = 0;  // To store the number of subarrays with sum k
        int curSum = 0; // To store the current cumulative sum

        // Initialize the map with a sum of 0 that occurs once
        sumMap.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i]; // Update the cumulative sum

            // Check if there is a subarray that sums to k
            if (sumMap.containsKey(curSum - k)) {
                count += sumMap.get(curSum - k);
            }

            // Update the frequency of the current cumulative sum in the map
            sumMap.put(curSum, sumMap.getOrDefault(curSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {2,4,1,5,1,5,1}, 6));
    }
}
