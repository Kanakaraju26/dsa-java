package easy;

import java.util.HashMap;

public class  Longest_Subarray_With_Sum_K {
    public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		HashMap<Integer,Integer> map = new HashMap<>();
		int sum =0;
		int maxlength = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if(sum==k){
				maxlength = i+1;
			}
			if (map.containsKey(sum - k)) {
                maxlength = Math.max(maxlength, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
			
		} 
		return maxlength;
	}
    public static void main(String[] args) {
        System.out.println(getLongestSubarray(new int[] {3,-1,6,-2,1,6}, 7));
    }
}
