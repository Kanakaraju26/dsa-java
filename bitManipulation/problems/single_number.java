package bitManipulation.problems;

public class single_number {
    public static int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        int res = 0;
        for(int i:nums){
            res ^= i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,4,5,9}));
    }
}
