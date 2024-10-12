package easy;

import java.util.HashMap;

public class Longest_Sub_Array_with_Sum_K {
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        // int maxLength = 0;
        // int currentSum = 0;
        // // Outer loop to pick the starting point
        // for (int i = 0; i < N; i++) {
        //     currentSum = 0;

        //     // Inner loop to pick the ending point
        //     for (int j = i; j < N; j++) {
        //         currentSum += A[j]; // Add current element to the sum

        //         // If the sum is equal to k, calculate the length of the sub-array
        //         if (currentSum == K) {
        //             maxLength = Math.max(maxLength, j - i + 1);
        //         }
        //     }
        // }

        // return maxLength;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < A.length; i++) {
            currentSum += A[i];  // Calculate the current prefix sum

            // If the current sum is equal to k, update maxLength
            if (currentSum == K) {
                maxLength = i + 1;
            }

            // Check if currentSum - k exists in the map
            if (map.containsKey(currentSum - K)) {
                maxLength = Math.max(maxLength, i - map.get(currentSum - K));
            }

            // Store the current prefix sum in the map if it’s not already present
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }

        return maxLength;
    
    }
    public static void main(String[] args) {
        System.out.println(lenOfLongSubarr(new int[] {2,4,1,8,5,8}, 6, 21));
    }
}
