package hard;

import java.util.*;
public class Longest_Subarray_With_Zero_Sum {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the cumulative sum
            cumulativeSum += arr[i];
            
            // If the cumulative sum is 0, we found a subarray from index 0 to i
            if (cumulativeSum == 0) {
                maxLength = i + 1;
            }
            
            // If the cumulative sum has been seen before
            if (sumMap.containsKey(cumulativeSum)) {
                // Calculate the length of the subarray with sum 0
                int prevIndex = sumMap.get(cumulativeSum);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                // Otherwise, store the cumulative sum with its index
                sumMap.put(cumulativeSum, i);
            }
        }
        
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(getLongestZeroSumSubarrayLength(new int[] {3,1,6,1,6,-7,-1}));
    }
}
