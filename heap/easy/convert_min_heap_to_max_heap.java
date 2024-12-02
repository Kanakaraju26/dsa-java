package heap.easy;

public class convert_min_heap_to_max_heap {
    public static void maxHeapify(int[] arr, int n, int i) {
        int largest = i; // Assume current node is the largest
        int left = 2 * i + 1; // Index of left child
        int right = 2 * i + 2; // Index of right child

        // Check if left child exists and is greater than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child exists and is greater than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest is not the root, swap and continue heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            maxHeapify(arr, n, largest);
        }
    }
    static void convertMinToMaxHeap(int N, int arr[]) {
         for (int i = (N / 2) - 1; i >= 0; i--) {
            maxHeapify(arr, N, i);
        }
  }
}