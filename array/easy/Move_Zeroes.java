package easy;

public class Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer to place non-zero elements

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining part of the array with zeroes
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,0,2,0,3,9,0,2,0};
        moveZeroes(arr);
    }
}