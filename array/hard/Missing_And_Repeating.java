package hard;

public class Missing_And_Repeating {
    static int[] findTwoElement(int arr[]) {
        int n = arr.length;
    int[] result = new int[2]; // To store the duplicate and missing numbers

    // Step 1: Place each element in its correct position
    for (int i = 0; i < n; i++) {
        // While the current element is not in its correct position
        while (arr[i] != arr[arr[i] - 1]) {
            // Swap arr[i] with arr[arr[i] - 1] to place it correctly
            int temp = arr[i];
            arr[i] = arr[temp - 1];
            arr[temp - 1] = temp;
        }
    }

    // Step 2: Identify the duplicate and the missing numbers
    for (int i = 0; i < n; i++) {
        if (arr[i] != i + 1) {
            result[0] = arr[i];    // The duplicate number
            result[1] = i + 1;     // The missing number
            break;
        }
    }
    
    return result;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[] ar = findTwoElement(new int[]{1,1,2,3,4});
    }
}
