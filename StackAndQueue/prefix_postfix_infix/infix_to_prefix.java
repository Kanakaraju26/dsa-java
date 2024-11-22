package StackAndQueue.prefix_postfix_infix;

import java.util.Stack;

public class infix_to_prefix {
    
    // Function to get precedence of operators
    static int precedence(char c) {
        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 1;
        return -1;
    }

    // Function to reverse the given string
    static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Function to convert infix to postfix
    static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // If current character is an operand, add it to result
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            }
            // If current character is '(', push it to stack
            else if (c == '(') {
                stack.push(c);
            }
            // If current character is ')', pop and append to result until '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();  // Remove '(' from stack
            }
            // If current character is an operator
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all remaining operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }
}
