package binarysearch.bson2d;

public class search_a_2d_matrix_ii {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner of the matrix
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int currentValue = matrix[row][col];
            if (currentValue == target) {
                return true; // Target found
            } else if (currentValue > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 8));
    }
}
