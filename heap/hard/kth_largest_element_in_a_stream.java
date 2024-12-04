package heap.hard;

import java.util.PriorityQueue;

public class kth_largest_element_in_a_stream {
    private PriorityQueue<Integer> minHeap; // Min-Heap to store the top k largest elements
    private int k;

    public kth_largest_element_in_a_stream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        
        // Add initial elements to the heap
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.add(val); // Add the new score to the heap
        if (minHeap.size() > k) {
            minHeap.poll(); // Remove the smallest element if heap size exceeds k
        }
        return minHeap.peek(); // The root of the heap is the k-th largest element
    }
}
