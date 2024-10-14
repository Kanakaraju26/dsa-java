package medium;

public class Next_Permutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
       int i = n - 2;

       // Step 1: Find the first decreasing element
       while (i >= 0 && nums[i] >= nums[i + 1]) {
           i--;
       }

       if (i >= 0) {
           // Step 2: Find the element just larger than nums[i]
           int j = n - 1;
           while (nums[j] <= nums[i]) {
               j--;
           }
           // Step 3: Swap
           swap(nums, i, j);
       }

       // Step 4: Reverse the suffix
       reverse(nums, i + 1, n - 1);
   }

   private static void swap(int[] nums, int i, int j) {
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
   }

   private static void reverse(int[] nums, int start, int end) {
       while (start < end) {
           swap(nums, start, end);
           start++;
           end--;
       }
   }
   public static void main(String[] args) {
    nextPermutation(new int[] {54,23,78,12,89,21});
   }
}
