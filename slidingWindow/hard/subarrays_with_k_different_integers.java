package slidingWindow.hard;

import java.util.HashMap;

public class subarrays_with_k_different_integers {
    public int subarraysWithKDistinct(int[] nums, int k) {
         return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }

    private static int countAtMost(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int start = 0, count = 0;

        for (int end = 0; end < nums.length; end++) {
            // Add the current number to the map
            freqMap.put(nums[end], freqMap.getOrDefault(nums[end], 0) + 1);

            // If we exceed k distinct integers, shrink the window
            while (freqMap.size() > k) {
                int startNum = nums[start];
                freqMap.put(startNum, freqMap.get(startNum) - 1);
                if (freqMap.get(startNum) == 0) {
                    freqMap.remove(startNum);
                }
                start++; // Shrink the window
            }

            // Add the count of subarrays in the current window
            count += end - start + 1;
        }

        return count;
    }
}
