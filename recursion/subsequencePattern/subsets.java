package recursion.subsequencePattern;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static List<List<Integer>> subset(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> result) {
        // Base case: add the current subset to the result
        result.add(new ArrayList<>(currentSubset));

        // Recursive case: consider each element starting from 'index'
        for (int i = index; i < nums.length; i++) {
            // Include the element at index 'i'
            currentSubset.add(nums[i]);
            
            // Recurse with the next index
            generateSubsets(nums, i + 1, currentSubset, result);
            
            // Backtrack by removing the last element to try the next possibility
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(subset(new int[] {2,4,5,7,8}));
    }
}
