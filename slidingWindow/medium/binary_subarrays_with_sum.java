package slidingWindow.medium;

import java.util.HashMap;

public class binary_subarrays_with_sum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // To handle cases where prefixSum == goal initially
        
        int prefixSum = 0; // Running prefix sum
        int count = 0;     // Count of valid subarrays
        
        for (int num : nums) {
            // Update the prefix sum
            prefixSum += num;
            
            // Check if (prefixSum - goal) exists in the map
            if (prefixSumMap.containsKey(prefixSum - goal)) {
                count += prefixSumMap.get(prefixSum - goal);
            }
            
            // Update the frequency of the current prefix sum in the map
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}
