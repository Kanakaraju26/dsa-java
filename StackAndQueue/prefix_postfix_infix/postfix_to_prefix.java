package StackAndQueue.prefix_postfix_infix;

import java.util.Stack;

public class postfix_to_prefix {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> stack = new Stack<>();

        // Traverse the postfix expression from left to right
        for (int i = 0; i < post_exp.length(); i++) {
            char ch = post_exp.charAt(i);

            // If the character is an operand, push it onto the stack
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            }
            // If the character is an operator
            else {
                // Pop two operands from the stack
                String operand2 = stack.pop();
                String operand1 = stack.pop();

                // Combine them in prefix order (operator operand1 operand2)
                String prefix = ch + operand1 + operand2;

                // Push the result back onto the stack
                stack.push(prefix);
            }
        }

        // The final result on the stack is the prefix expression
        return stack.pop();
    }
}
