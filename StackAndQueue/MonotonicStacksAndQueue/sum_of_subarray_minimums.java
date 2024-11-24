package StackAndQueue.MonotonicStacksAndQueue;

import java.util.Stack;

public class sum_of_subarray_minimums {
    public int sumSubarrayMins(int[] arr) {
         int n = arr.length;
        long mod = 1_000_000_007;

        // Arrays to store distances to previous and next smaller elements
        int[] left = new int[n];  // Distance to previous smaller element
        int[] right = new int[n]; // Distance to next smaller element

        Stack<Integer> stack = new Stack<>();

        // Calculate left[] (Previous Smaller Element distance)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear(); // Clear the stack to reuse for right[]

        // Calculate right[] (Next Smaller Element distance)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // Calculate the sum of contributions
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + (long) arr[i] * left[i] * right[i]) % mod;
        }

        return (int) sum;
    }
}
