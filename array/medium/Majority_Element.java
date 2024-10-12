package medium;

import java.util.HashMap;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
        int n = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) > n){
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int n = majorityElement(new int[] {3,5,1,6,1,6});
    }
}
