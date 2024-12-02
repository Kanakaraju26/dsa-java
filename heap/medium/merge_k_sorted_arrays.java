package heap.medium;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Element {
    int value;
    int row;
    int col;

    // Correct Constructor
    Element(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }
}
public class merge_k_sorted_arrays {
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        // Result array
        ArrayList<Integer> result = new ArrayList<>();

        // Min-heap to store elements (value, row, col)
        PriorityQueue<Element> minHeap = new PriorityQueue<>((a, b) -> a.value - b.value);

        // Step 1: Add the first element of each row into the heap
        for (int i = 0; i < K; i++) {
            minHeap.add(new Element(arr[i][0], i, 0));
        }

        // Step 2: Extract the smallest element and push the next element from the same row
        while (!minHeap.isEmpty()) {
            Element current = minHeap.poll();
            result.add(current.value);

            // If there is a next element in the same row, add it to the heap
            if (current.col + 1 < K) {
                minHeap.add(new Element(arr[current.row][current.col + 1], current.row, current.col + 1));
            }
        }

        return result;
    }
}
