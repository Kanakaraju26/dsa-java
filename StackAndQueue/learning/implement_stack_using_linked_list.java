package StackAndQueue.learning;

public class implement_stack_using_linked_list {
     class StackNode {
        int data;
        StackNode next;
        StackNode(int a) {
            data = a;
            next = null;
        }
    }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        
        StackNode temp = new StackNode(a);
            temp.next = top;
            top=temp;
        
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if (top == null) {
            return -1; // Stack is empty
        }
        int poppedValue = top.data; // Get the top value
        top = top.next;             // Move top pointer to the next node
        return poppedValue; 
    }
}
