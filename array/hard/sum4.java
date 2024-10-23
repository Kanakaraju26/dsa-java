package hard;

import java.util.*;
public class sum4 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result; // No possible quadruplets
        }

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Iterate through the array and use two pointers for the last two elements
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                
                // Two-pointer approach for the remaining two numbers
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    double sum = (double)nums[i] + (double)nums[j] + (double)nums[left] + (double)nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for the third number
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Skip duplicates for the fourth number
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Increase sum by moving left pointer
                    } else {
                        right--; // Decrease sum by moving right pointer
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        List<List<Integer>> ls = fourSum(new int[] {5,2,1,4,1,4},6);
    }
}
