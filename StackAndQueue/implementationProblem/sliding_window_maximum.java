package StackAndQueue.implementationProblem;

import java.util.ArrayDeque;
import java.util.Deque;

public class sliding_window_maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];

    int n = nums.length;
    int[] result = new int[n - k + 1];
    Deque<Integer> deque = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
        // Remove indices of elements not in the current window
        if (!deque.isEmpty() && deque.peek() < i - k + 1) {
            deque.poll();
        }

        // Remove indices of smaller elements from the back of the deque
        while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
            deque.pollLast();
        }

        // Add the current element's index to the deque
        deque.offer(i);

        // If the window has reached size k, record the maximum
        if (i >= k - 1) {
            result[i - k + 1] = nums[deque.peek()];
        }
    }

    return result;
    }
}
