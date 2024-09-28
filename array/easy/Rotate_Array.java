package easy;

public class Rotate_Array {
    public  static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the length of the array
        
        // Create a temporary array to store the rotated result
        int[] arr = new int[n];
        
        // Step 1: Copy the last 'k' elements to the beginning of arr
        for (int i = 0; i < k; i++) {
            arr[i] = nums[n - k + i];
        }
        
        // Step 2: Copy the first 'n - k' elements to the remaining positions in arr
        for (int i = k; i < n; i++) {
            arr[i] = nums[i - k];
        }
        
        // Step 3: Copy back the rotated array into the original nums array
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
    
    public static void main(String[] args) {
        int[] arr = {5,2,7,2,1,7};
        System.out.println(rotate(arr, 8));
    }
}
