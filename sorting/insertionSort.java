package sorting;

public class insertionSort{
    static void insert(int[] arr,int i)
  {
       // Your code here
       int key = arr[i];
        int j = i - 1;

        // Move elements of arr[0..i-1], that are greater than key,
        // to one position ahead of their current position
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
  }
  //Function to sort the array using insertion sort algorithm.
  public static void insertionSort1(int[] arr, int n)
  {
      //code here
         for (int i = 1; i < n; i++) {
            insert(arr, i);
        }
  }
    public static void main(String[] args) {
        int[] arr = {7,3,2,7,3,9};
        insertionSort1(arr,6);
    }
}