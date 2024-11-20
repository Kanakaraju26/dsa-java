package StackAndQueue.learning;

public class implement_queue_using_array {
    int front, rear;
	int arr[] = new int[100005];

    implement_queue_using_array()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    arr[rear] = x;
        rear++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		 if (front == rear) {
            return -1; // Queue is empty
        }
        // Retrieve the front element and move the front pointer.
        int popped = arr[front];
        front++;
        return popped;
	} 
}
