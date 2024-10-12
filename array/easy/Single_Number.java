package easy;

import java.util.HashMap;
import java.util.Map;

public class Single_Number {
     public static int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue()==1){
                    return entry.getKey();
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {4,4,2,2,1,3,1}));
    }
}
