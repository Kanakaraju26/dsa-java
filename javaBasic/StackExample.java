package javaBasic;

import java.util.Stack;
// Stack .push .peek .pop .search .isEmpty .clear

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of Integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display the Stack
        System.out.println("Stack: " + stack);

        // Peek at the top element of the Stack without removing it
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // Pop elements from the Stack (removes and returns the top element)
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Search for an element in the Stack
        int position = stack.search(30);
        System.out.println("Position of 30 in Stack (1-based index): " + position);

        // Check if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);

        // Iterate over the elements in the Stack
        System.out.println("Iterating over the Stack:");
        for (Integer element : stack) {
            System.out.println(element);
        }

        // Clear all elements from the Stack
        stack.clear();
        System.out.println("Stack after clearing all elements: " + stack);
        System.out.println("Is the Stack empty after clearing? " + stack.isEmpty());
    }
}
