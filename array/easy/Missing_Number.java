package easy;

import java.util.Arrays;

public class Missing_Number {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {1,2,3,4,5,7,}));
    }
}
