package hard;


public class Maximum_Product_Subarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0]; // To handle negative numbers

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // If the number is negative, swap currentMax and currentMin
            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            // Update the current maximum and minimum product
            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            // Update the overall maximum product found
            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1,5,-1,5,6,7}));
    }
}
