package notes;

import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {5, 2, 9, 1, 5, 6};

        // 1. sort(): Sorts the array in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // 2. binarySearch(): Searches for a value in a sorted array and returns its index
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5 in sorted array: " + index);

        // 3. fill(): Fills all elements of the array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Array filled with 10: " + Arrays.toString(filledArray));

        // 4. copyOf(): Copies an array to a new array of specified length
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // 5. copyOfRange(): Copies a range from the array to a new array
        int[] rangeArray = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Array copied from range (1 to 4): " + Arrays.toString(rangeArray));

        // 6. equals(): Compares two arrays for equality
        boolean isEqual = Arrays.equals(arr, copiedArray);
        System.out.println("Are the original and copied arrays equal? " + isEqual);

        // 7. toString(): Converts an array to a string for display
        System.out.println("Array as a string: " + Arrays.toString(arr));

        // 8. asList(): Converts an array into a List (useful for non-primitive types)
        String[] strArr = {"Java", "Python", "C++"};
        System.out.println("Array as a List: " + Arrays.asList(strArr));

        // 9. parallelSort(): Sorts the array in parallel (faster for large arrays)
        int[] largeArray = {10, 5, 3, 7, 9, 1, 4, 6};
        Arrays.parallelSort(largeArray);
        System.out.println("Parallel sorted array: " + Arrays.toString(largeArray));

        // 10. mismatch(): Finds the index where two arrays differ
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        int mismatchIndex = Arrays.mismatch(arr1, arr2);
        System.out.println("Mismatch index between arr1 and arr2: " + mismatchIndex);

        // 11. setAll(): Sets each element of the array using a generator
        int[] setAllArray = new int[5];
        Arrays.setAll(setAllArray, i -> i * 2); // Fills array with multiples of 2
        System.out.println("Array after setAll(): " + Arrays.toString(setAllArray));

        // 12. stream(): Creates a stream from an array (for functional operations)
        System.out.println("Stream operations: ");
        Arrays.stream(arr).forEach(System.out::println);
    }
}
