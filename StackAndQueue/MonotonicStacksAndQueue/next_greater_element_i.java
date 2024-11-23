package StackAndQueue.MonotonicStacksAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class next_greater_element_i {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
         Map<Integer, Integer> ngeMap = new HashMap<>(); // To store the next greater element for each number
        Stack<Integer> stack = new Stack<>(); // Stack to find the next greater elements

        // Traverse nums2 in reverse to calculate NGE
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            // Pop elements from the stack smaller than or equal to the current number
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            // If stack is empty, there is no greater element; otherwise, top of stack is the NGE
            ngeMap.put(num, stack.isEmpty() ? -1 : stack.peek());

            // Push the current number onto the stack
            stack.push(num);
        }

        // Build the result for nums1 using the precomputed NGE map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = ngeMap.get(nums1[i]);
        }

        return result;
    }
}
