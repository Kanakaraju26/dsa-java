package recursion.getAStronghold;

import java.util.Arrays;
import java.util.Stack;

public class reverse_a_stack {
    static void reverse(Stack<Integer> stack)
    {
        // add your code here
        if (!stack.isEmpty()) {
            // Remove the top element
            int top = stack.pop();
            
            // Recursively reverse the remaining stack
            reverse(stack);
            
            // Insert the removed element at the bottom
            insertAtBottom(stack, top);
        }
    }

    // Helper function to insert an element at the bottom of the stack
    private static void insertAtBottom(Stack<Integer> stack, int element) {
        // Base case: if stack is empty, push the element
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        // Remove the top element and recursively call for the rest of the stack
        int top = stack.pop();
        insertAtBottom(stack, element);

        // Put the top element back after inserting the element at the bottom
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(2, 4, 1, 4, 1));
        reverse(stack);
    }
}
