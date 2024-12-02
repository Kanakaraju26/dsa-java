package heap.medium;

import java.util.PriorityQueue;

public class kth_largest_element_in_an_array {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Iterate through the array
        for (int num : nums) {
            // Add the current element to the heap
            minHeap.add(num);

            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                System.out.println(minHeap);
                minHeap.poll();
            }
        }
               
        // The root of the heap is the kth largest element
        return minHeap.peek();
    }
}
