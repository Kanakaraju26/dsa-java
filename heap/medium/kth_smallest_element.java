package heap.medium;

import java.util.PriorityQueue;

public class kth_smallest_element {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a);
        for(int i:arr){
            maxHeap.add(i);
             // If the heap size exceeds k, remove the largest element
        if (maxHeap.size() > k) {
            maxHeap.poll(); // Remove the largest element
        }
        }
        return maxHeap.peek();
    }
}
