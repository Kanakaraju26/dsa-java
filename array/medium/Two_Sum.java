package medium;

import java.util.HashMap;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]),i};
            }
                map.put(nums[i],i);
            
        }
        return new int[] {3,2};
    }  
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[] arr = twoSum(new int[] {3,1,6,1,7,8},10);
    }
}
