package sorting;
public class mergeSort{
    static void merge(int[] arr, int l, int m, int r)
    {
         // Your code here
         // Find sizes of the two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary arrays to store left and right subarrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        // Merge the two subarrays back into arr[l..r]
        int i = 0; 
        int j = 0; // Initial indices of L[] and R[]

        // Initial index of the merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy the remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergeSort1(int[] arr, int l, int r)
    {
        //code here
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort the first and second halves
            mergeSort1(arr, l, m);
            mergeSort1(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,3,2,7,3,9};
        mergeSort1(arr,7,9);
    }
}
