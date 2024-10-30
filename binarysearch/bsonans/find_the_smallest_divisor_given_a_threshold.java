package binarysearch.bsonans;

public class find_the_smallest_divisor_given_a_threshold {
    public  static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        
        // Determine the upper boundary for the divisor
        for (int i : nums) {
            right = Math.max(right, i);
        }

        int minDivisor = right;

        // Binary search to find the smallest divisor
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDivide(mid, nums, threshold)) {
                minDivisor = mid; // Update result to the current mid
                right = mid - 1;  // Try to find a smaller divisor
            } else {
                left = mid + 1;   // Increase the divisor
            }
        }
        return minDivisor;
    }

    // Helper function to check if we can use `divisor` to keep sum within the threshold
    static boolean canDivide(int divisor, int[] nums, int threshold) {
        int sum = 0;
        for (int i : nums) {
            sum += (i + divisor - 1) / divisor; // Equivalent to Math.ceil((double)i / divisor)
        }
        return sum <= threshold;
    }
    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[] {2,6,8,9,9}, 3));
    }
}
