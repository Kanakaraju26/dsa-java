package binarysearch.bsonans;

public class Split_Array_Largest_Sum {
    public static int splitArray(int[] nums, int k) {
        int left = 0, right = 0;

        // Initialize the boundaries for binary search
        for (int num : nums) {
            left = Math.max(left, num);  // Max element
            right += num;                // Sum of all elements
        }

        // Perform binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if we can split with max sum as mid
            if (canSplit(nums, k, mid)) {
                right = mid;  // Try to find a smaller possible max sum
            } else {
                left = mid + 1;  // Increase the max sum
            }
        }

        return left;
    }
    private static boolean canSplit(int[] nums, int k, int maxSum) {
        int currentSum = 0, splits = 1;

        for (int num : nums) {
            currentSum += num;

            // If current sum exceeds maxSum, we need a new subarray
            if (currentSum > maxSum) {
                splits++;
                currentSum = num;  // Start new subarray with the current number
                if (splits > k) return false;  // More splits than allowed
            }
        }

        return true;  // Successfully split within the allowed subarrays
    }
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{2,3,5,6,8,9}, 4));
    }
}
