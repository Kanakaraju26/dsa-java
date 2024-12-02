package heap.easy;

public class does_array_represent_heap {
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        for (int i = 0; i <= (n - 2) / 2; i++) {
            // Get left and right child indices
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // Check if the left child exists and violates the max heap property
            if (left < n && arr[i] < arr[left]) {
                return false;
            }

            // Check if the right child exists and violates the max heap property
            if (right < n && arr[i] < arr[right]) {
                return false;
            }
        }
        return true;
    }
}
