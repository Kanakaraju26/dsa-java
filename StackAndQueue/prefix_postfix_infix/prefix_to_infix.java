package StackAndQueue.prefix_postfix_infix;

import java.util.Stack;

public class prefix_to_infix {
    static String preToInfix(String prefix) {
        // code here
        Stack<String> stack = new Stack<>();

        // Start from the end of the prefix expression
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            // If the character is an operand, push it to the stack
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            }
            // If the character is an operator
            else {
                // Pop two operands from the stack
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                // Form a string in the format "(operand1 operator operand2)"
                String infix = "(" + operand1 + c + operand2 + ")";
                stack.push(infix);
            }
        }

        // The last element in the stack will be the full infix expression
        return stack.pop();
    }
}
