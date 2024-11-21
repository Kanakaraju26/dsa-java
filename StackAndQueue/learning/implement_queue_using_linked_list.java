package StackAndQueue.learning;

public class implement_queue_using_linked_list {

    class QueueNode {
        int data;
        QueueNode next;

        QueueNode(int a) {
            data = a;
            next = null;
        }
    }

    QueueNode front, rear;

    // Function to push an element into the queue.
    void push(int a) {
        // Your code here
        QueueNode nn = new QueueNode(a);
        if (rear == null) {
            front = rear = nn;
            return;
        }
        rear.next = nn;
        rear = nn;
    }

    // Function to pop front element from the queue.
    int pop() {
        // Your code here
        if (front == null)
            return -1;
        int n = front.data;
        front = front.next;
        if (front == null) { // If the queue becomes empty
            rear = null; // Update rear to null as well
        }
        return n;
    }
}
