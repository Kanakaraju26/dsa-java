package easy;


public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;  // 'k' will point to the next position to insert a unique element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not the same as the previous one, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];  // Assign the current element to the k-th position
                k++;  // Increment k to point to the next unique position
            }
        }

        return k;  // Return the number of unique elements
    }    
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1,1,3};
        System.out.println(removeDuplicates(arr));
    }
}
