package binarysearch.bson2d;

public class Row_with_max_1s {
    public static int rowWithMax1s(int arr[][]) {
        // code here
        int max = 0;
        int idx = -1;
        int m = arr[0].length; // Number of columns

        for (int i = 0; i < arr.length; i++) {
            // Use binary search to find the first occurrence of 1
            int left = 0, right = m - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (arr[i][mid] == 0) {
                    left = mid + 1; // Search to the right
                } else {
                    right = mid; // Search to the left
                }
            }

            int count = (arr[i][left] == 1) ? (m - left) : 0; // Number of 1's in row
            if (count > max) {
                max = count;
                idx = i;
            }
        }
        return idx;

    }
    public static void main(String[] args) {
        System.out.println(rowWithMax1s(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
    }
}
