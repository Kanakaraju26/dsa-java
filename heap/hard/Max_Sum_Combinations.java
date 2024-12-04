package heap.hard;

import java.util.ArrayList;
import java.util.Collections;

public class Max_Sum_Combinations {
    public static ArrayList<Integer> getMaxSumCombinations(int[] A, int[] B, int C) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> allSums = new ArrayList<>();
        
        // Generate all possible sums
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                allSums.add(A[i] + B[j]);
            }
        }
        
        // Sort the sums in descending order
        Collections.sort(allSums, Collections.reverseOrder());
        
        // Add the top C sums to the result
        for (int i = 0; i < C; i++) {
            result.add(allSums.get(i));
        }
        
        return result;
    }
}