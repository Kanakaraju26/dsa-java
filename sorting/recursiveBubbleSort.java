package sorting;

public class recursiveBubbleSort {
    public static void bubbleSort(int[] arr, int n)
    {
        //code here
        if(n == 1)
            return;

        int didSwap = 0;
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }
        }

        // if no swapping happens.
        if (didSwap == 0) return;

        //Range reduced after recursion:
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {7,3,2,7,3,9};
        bubbleSort(arr, 6);
    }
}