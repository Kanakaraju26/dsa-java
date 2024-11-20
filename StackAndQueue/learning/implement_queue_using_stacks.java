package StackAndQueue.learning;

import java.util.Stack;

public class implement_queue_using_stacks {
    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public implement_queue_using_stacks() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // Push element x to the back of the queue.
    public void push(int x) {
        inputStack.push(x);
    }

    // Removes the element from the front of the queue and returns it.
    public int pop() {
        if (outputStack.isEmpty()) {
            // Transfer elements from inputStack to outputStack if outputStack is empty
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.isEmpty() ? -1 : outputStack.pop();
    }

    // Get the front element.
    public int peek() {
        if (outputStack.isEmpty()) {
            // Transfer elements from inputStack to outputStack if outputStack is empty
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.isEmpty() ? -1 : outputStack.peek();
    }

    // Returns whether the queue is empty.
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
