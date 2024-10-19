package medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
     public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int right = n-1;
        int bottom = m - 1;
        int left = 0;

         while (top <= bottom && left <= right) {
            // Move right across the top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // Move the top boundary down

            // Move down the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Move the right boundary left

            // Move left across the bottom row (if applicable)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom boundary up
            }

            // Move up the left column (if applicable)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Move the left boundary right
            }
        }

        return result;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        List<Integer> arr = spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
    }
}
