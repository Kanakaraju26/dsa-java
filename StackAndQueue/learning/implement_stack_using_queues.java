package StackAndQueue.learning;

import java.util.LinkedList;
import java.util.Queue;

public class implement_stack_using_queues {
     Queue<Integer> q ;
    public implement_stack_using_queues() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++)
            q.add(q.poll());

    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
