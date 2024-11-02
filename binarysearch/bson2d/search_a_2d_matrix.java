package binarysearch.bson2d;

public class search_a_2d_matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_val = matrix[mid / n][mid % n];

            if (mid_val == target)
                return true;
            else if (mid_val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 2));
    }
}
