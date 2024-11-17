package bitManipulation.problems;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        // There are 2^n subsets
        int totalSubsets = 1 << n;  // This is equal to 2^n
        
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            // Check each bit position in the binary number i
            for (int j = 0; j < n; j++) {
                // If the j-th bit of i is set, include nums[j] in the subset
                if ((i & (1 << j)) != 0) {
                    System.out.println(nums[j]);
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        
        return result;
    }
    public static void main(String[] args) {
        System.out.println(subset(new int[] {2,5,7,8,2}));
    }
}
