package StackAndQueue.learning;

public class implement_stack_using_array {
    private int[] arr;
    private int top;

    public implement_stack_using_array() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        arr[++top] = x;
    }

    public int pop() {
        // Your Code
        if(top==-1) return -1;
        int n = arr[top];
        top--;
        return n;
    }
}
