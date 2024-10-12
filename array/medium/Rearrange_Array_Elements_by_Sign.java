package medium;

public class Rearrange_Array_Elements_by_Sign {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; 
        
        int posIndex = 0; 
        int negIndex = 1; 
        
        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2; 
            } else {
                result[negIndex] = num;
                negIndex += 2; 
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[] arr = rearrangeArray(new int[]{3,5,2,5,1,6});
    }
}
