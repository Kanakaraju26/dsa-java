package hard;

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II {
    public static List<Integer> majorityElement(int[] nums) {
        //Boyer-Moore Voting Algorithm 
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        // Step 1: Find the two majority candidates
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify the candidates by counting their occurrences
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        // Step 3: Add valid candidates to the result list
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        List<Integer> ls = majorityElement(new int[] {6,5,2,6,1,6,1});
    }
}
