package StackAndQueue.prefix_postfix_infix;

import java.util.Stack;

public class postfix_to_infix {
    static String postToInfix(String exp) {
        // code here
        Stack<String> stack = new Stack<>();

        // Traverse each character in the postfix expression
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If the character is an operand, push it onto the stack
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            }
            // If the character is an operator, pop two elements and combine
            else {
                String operand2 = stack.pop(); // Pop the top operand
                String operand1 = stack.pop(); // Pop the second operand

                // Combine them in the form (operand1 operator operand2)
                String result = "(" + operand1 + ch + operand2 + ")";
                // System.out.println(result);
                stack.push(result); // Push the resulting expression back to the stack
            }
        }

        // The final element in the stack is the complete infix expression
        String s = stack.pop();
        return s;
    }
}
