package StackAndQueue.implementationProblem;

import java.util.ArrayList;
import java.util.Stack;

public class online_stock_span {
    int count = -1;
	Stack<Integer> st = new Stack<>();
	ArrayList<Integer>al = new ArrayList<>();
    public int next(int price) {
        
    	while(!st.isEmpty() && al.get(st.peek())<=price)
    	{
    		st.pop();
    	}
        
    	count++;
    	int ans = count+1;
    	if(!st.isEmpty())
    	{
    		ans = count - st.peek();
    	}
        al.add(price);
        st.add(count);
        
    	//System.out.println(count+" "+al+" "+st+" "+ans);
    	return ans;
    }
}
