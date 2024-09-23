package sorting;

public class quickSort {
    static void quickSort1(int[] arr, int low, int high)
    {
        // code here
         if (low < high) {
            // Find the partitioning index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort1(arr, low, pi - 1);
            quickSort1(arr, pi + 1, high);
         }
    }
    static int partition(int[] arr, int low, int high)
    {
        // your code here
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    } 
    public static void main(String[] args) {
        int[] arr = {7,3,2,7,3,9};
        quickSort1(arr, 3, 9);
    }
}
