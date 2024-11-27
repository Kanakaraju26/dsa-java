package StackAndQueue.MonotonicStacksAndQueue;

import java.util.Stack;

public class largest_rectangle_in_histogram {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            // Use 0 height for the imaginary bar after the last index
            int currentHeight = (i == n) ? 0 : heights[i];

            // Calculate area for heights taller than currentHeight
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
