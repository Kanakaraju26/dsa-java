package hard;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays_Without_Extra_Space {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] A, long[] B) {
        int N = A.length;
        int M = B.length;

        // Iterate over A from the last element to the first.
        for (int i = N - 1; i >= 0; i--) {
            // Only swap if the current element of A is greater than the smallest element in
            // B.
            if (A[i] > B[0]) {
                // Swap A[i] with B[0]
                long temp = A[i];
                A[i] = B[0];
                B[0] = temp;

                // Now B[0] might be out of order, so we need to re-sort B
                // We use insertion sort logic for B[0]
                long first = B[0];
                int k = 1;

                // Shift all elements in B[1:] that are smaller than B[0] to the left
                while (k < M && B[k] < first) {
                    B[k - 1] = B[k];
                    k++;
                }
                B[k - 1] = first;
            }
        }
        Arrays.sort(A);
    }
    public static void main(String[] args) {
        mergeTwoSortedArraysWithoutExtraSpace(new long[]{3,4,5,8}, new long[]{4,5,6,7,9});
    }
}
