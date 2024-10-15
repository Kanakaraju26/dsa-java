package medium;

import java.util.*;
public class Longest_Successive_Elements {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }

        int longestSequence = 0;

        // Step 2: Iterate through each element and check for the start of a sequence
        for (int num : a) {
            // If num is the start of a sequence (i.e., num - 1 doesn't exist)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Check for all subsequent numbers in the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest sequence found
                longestSequence = Math.max(longestSequence, currentStreak);
            }
        }

        return longestSequence;
    }
    public static void main(String[] args) {
        System.out.println(longestSuccessiveElements(new int[] {3,2,5,7,1,9}));   
    }
}
