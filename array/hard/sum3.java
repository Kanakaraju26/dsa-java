package hard;

import java.util.*;

public class sum3 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for the first number
            }
            int target = -nums[i];
            HashSet<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                if (seen.contains(target - nums[j])) {
                    result.add(Arrays.asList(nums[i], nums[j], target - nums[j]));
                    // Skip duplicates for the second number
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                        j++;
                    }
                }
                seen.add(nums[j]);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        List<List<Integer>> ls = threeSum(new int[] {5,2,1,4,1,4});
    }
}
