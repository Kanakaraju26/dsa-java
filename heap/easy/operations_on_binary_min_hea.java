package heap.easy;

public class operations_on_binary_min_hea {
    class MinHeap {
        int[] harr;
        int capacity;
        int heap_size;
        MinHeap(int cap) {
            heap_size = 0;
            capacity = cap;
            harr = new int[cap];
        }
        int parent(int i) { return (i - 1) / 2; }
        int left(int i) { return (2 * i + 1); }
        int right(int i) { return (2 * i + 2); }
    
        //Function to extract minimum value in heap and then to store 
        //next minimum value at first index.
        int extractMin()
        {
            // Your code here.
            if (heap_size <= 0) return -1; // No elements
        if (heap_size == 1) {
            heap_size--;
            return harr[0];
        }
    
        // Store the root (minimum)
        int root = harr[0];
    
        // Replace root with last element
        harr[0] = harr[heap_size - 1];
        heap_size--;
    
        // Restore heap property
        MinHeapify(0);
    
        return root;
        }
    
        //Function to insert a value in Heap.
        void insertKey(int k) 
        {
            // Your code here.
             if (heap_size == capacity) {
            System.out.println("Overflow: Could not insert key");
            return;
        }
        // Add the new key at the end
        heap_size++;
        int i = heap_size - 1;
        harr[i] = k;
    
        // Fix the min-heap property
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
        }
    
        //Function to delete a key at ith index.
        void deleteKey(int i) 
        {
            // Your code here.
            decreaseKey(i, -1); // Move to the root
        extractMin();  
        }
    
        //Function to change value at ith index and store that value at first index.
        void decreaseKey(int i, int new_val) 
        {
            harr[i] = new_val;
            while (i != 0 && harr[parent(i)] > harr[i]) {
                int temp = harr[i];
                harr[i] = harr[parent(i)];
                harr[parent(i)] = temp;
                i = parent(i);
            }
        }
    
        /* You may call below MinHeapify function in
          above codes. Please do not delete this code
          if you are not writing your own MinHeapify */
        void MinHeapify(int i) {
            int l = left(i);
            int r = right(i);
            int smallest = i;
            if (l < heap_size && harr[l] < harr[i]) smallest = l;
            if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
            if (smallest != i) {
                int temp = harr[i];
                harr[i] = harr[smallest];
                harr[smallest] = temp;
                MinHeapify(smallest);
            }
        }
    }
    
}
