package medium;

import java.util.List;

public class Maximum_Score_from_Subarray_Minimums {
    public static int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
       int max = 0;
        int idx=0;
        // Iterate through the list to find the two largest numbers
        while (true) {
            try{
            int sum = arr.get(idx) + arr.get(idx+1);
            if(sum>max)
                max = sum;
            }catch(Exception e){
                break;
            }
            idx++;
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println(pairWithMaxSum(null));
    }
}
