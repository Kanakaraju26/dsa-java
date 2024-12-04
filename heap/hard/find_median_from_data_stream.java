package heap.hard;

import java.util.ArrayList;
import java.util.Collections;

public class find_median_from_data_stream {
    private ArrayList<Integer> arr;

    public find_median_from_data_stream() {
        arr = new ArrayList<>();
    }

    // Add number to the data structure
    public void addNum(int num) {
        // Find the correct position to insert the number
        int pos = Collections.binarySearch(arr, num);
        if (pos < 0) pos = -(pos + 1); // If not found, binarySearch returns -(insertionPoint + 1)
        arr.add(pos, num); // Insert at the correct position
    }

    // Find the median of the current list
    public double findMedian() {
        int size = arr.size();
        if (size % 2 == 1) {
            // Odd size: Return the middle element
            return arr.get(size / 2);
        } else {
            // Even size: Return the average of the two middle elements
            return (arr.get(size / 2 - 1) + arr.get(size / 2)) / 2.0;
        }
    }
}
