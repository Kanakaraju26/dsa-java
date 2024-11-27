package StackAndQueue.MonotonicStacksAndQueue;

import java.util.Stack;

public class remove_k_digits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

    // Traverse each digit in num
    for (char digit : num.toCharArray()) {
        // Remove larger digits if we can still remove more (k > 0)
        while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
            stack.pop();
            k--;
        }
        stack.push(digit);
    }

    // If k > 0, remove remaining digits from the top
    while (k > 0 && !stack.isEmpty()) {
        stack.pop();
        k--;
    }

    // Build the result from the stack
    StringBuilder result = new StringBuilder();
    while (!stack.isEmpty()) {
        result.append(stack.pop());
    }
    result.reverse();

    // Remove leading zeros
    while (result.length() > 0 && result.charAt(0) == '0') {
        result.deleteCharAt(0);
    }

    return result.length() == 0 ? "0" : result.toString();
    }    
}