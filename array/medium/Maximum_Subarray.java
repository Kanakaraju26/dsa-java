package medium;

public class Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int currmax = nums[0];
        
        for(int i =1;i<nums.length;i++){
            currmax = Math.max(nums[i],currmax+nums[i]);
            max = Math.max(max,currmax);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {5,2,6,1,6,1}));
    }
}
