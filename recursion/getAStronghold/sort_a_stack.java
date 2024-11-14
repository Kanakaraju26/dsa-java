package recursion.getAStronghold;

import java.util.Arrays;
import java.util.Stack;

public class sort_a_stack {
    public static Stack<Integer> sort(Stack<Integer> stack) {
         if (!stack.isEmpty()) {
            // Remove the top element
            int top = stack.pop();
            
            // Recursively sort the remaining stack
            sort(stack);
            
            // Insert the popped element in sorted order
            insertInSortedOrder(stack, top);
        }
        return stack;
    }

    // Helper function to insert an element into the sorted stack
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        // Base case: if stack is empty or the top element is smaller than 'element'
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Remove the top element and recursively call for the rest of the stack
        int top = stack.pop();
        insertInSortedOrder(stack, element);

        // Put the top element back after inserting the element in sorted order
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(2, 4, 1, 4, 1));

        System.out.println(sort(stack));
    }
}
