package StackAndQueue.MonotonicStacksAndQueue;

import java.util.Stack;

public class next_greater_element_ii {
    public static int[] nextGreaterElements(int[] nums) {
         int n = nums.length;
        int[] res = new int[n]; // Result array to store NGE
        Stack<Integer> stack = new Stack<>(); // Monotonic decreasing stack

        // Initialize result array to -1
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }

        // Traverse the array twice to handle circular behavior
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            
            // Resolve elements in the stack
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                int idx = stack.pop(); // Index of element whose NGE is found
                res[idx] = num;
            }
            
            // Push index onto the stack only in the first pass
            if (i < n) {
                stack.push(i % n);
            }
        }

        return res;
    }
}
