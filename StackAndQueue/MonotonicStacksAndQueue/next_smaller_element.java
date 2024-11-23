package StackAndQueue.MonotonicStacksAndQueue;

import java.util.Stack;

public class next_smaller_element {
    public int[] prevSmaller(int[] A) {
        int n = A.length;
        int[] G = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Remove elements that are greater or equal to the current element
            while (!stack.isEmpty() && stack.peek() >= A[i]) {
                stack.pop();
            }

            // If stack is empty, no smaller element exists
            if (stack.isEmpty()) {
                G[i] = -1;
            } else {
                G[i] = stack.peek();
            }

            // Push current element onto the stack
            stack.push(A[i]);
        }

        return G;
    }
}
