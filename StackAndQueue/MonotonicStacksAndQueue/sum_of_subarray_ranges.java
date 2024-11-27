package StackAndQueue.MonotonicStacksAndQueue;

import java.util.Stack;

public class sum_of_subarray_ranges {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
    long totalMax = 0, totalMin = 0;

    Stack<Integer> stack = new Stack<>();

    // Calculate contributions as maximum
    for (int i = 0; i <= n; i++) {
        while (!stack.isEmpty() && (i == n || nums[stack.peek()] < nums[i])) {
            int mid = stack.pop();
            int left = stack.isEmpty() ? -1 : stack.peek();
            int right = i;
            totalMax += (long) nums[mid] * (mid - left) * (right - mid);
        }
        stack.push(i);
    }

    stack.clear();

    // Calculate contributions as minimum
    for (int i = 0; i <= n; i++) {
        while (!stack.isEmpty() && (i == n || nums[stack.peek()] > nums[i])) {
            int mid = stack.pop();
            int left = stack.isEmpty() ? -1 : stack.peek();
            int right = i;
            totalMin += (long) nums[mid] * (mid - left) * (right - mid);
        }
        stack.push(i);
    }

    return totalMax - totalMin;
    }
}
