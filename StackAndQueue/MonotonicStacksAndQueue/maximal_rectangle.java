package StackAndQueue.MonotonicStacksAndQueue;

import java.util.Stack;

public class maximal_rectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0)
            return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        // Iterate through each row
        for (int i = 0; i < rows; i++) {
            // Update heights array
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1; // Increase the height
                } else {
                    heights[j] = 0; // Reset the height
                }
            }

            // Calculate the max area for the current histogram
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    // Helper function to find the largest rectangle in a histogram
    private static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
