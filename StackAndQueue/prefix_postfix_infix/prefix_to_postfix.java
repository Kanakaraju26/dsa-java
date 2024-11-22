package StackAndQueue.prefix_postfix_infix;

import java.util.Stack;

public class prefix_to_postfix {
    static String preToPost(String pre_exp) {
        // code here
         Stack<String> stack = new Stack<>();

        // Traverse the prefix expression from right to left
        for (int i = pre_exp.length() - 1; i >= 0; i--) {
            char ch = pre_exp.charAt(i);

            // If the character is an operand, push it to the stack
            if (Character.isLetterOrDigit(ch)) {
                stack.push(Character.toString(ch));
            } else {
                // The character is an operator
                // Pop two elements from the stack
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                // Form the postfix expression: operand1 operand2 operator
                String postfix = operand1 + operand2 + ch;

                // Push the combined expression back to the stack
                stack.push(postfix);
            }
        }

        // The final element in the stack is the postfix expression
        return stack.pop();
    }
}