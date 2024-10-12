package easy;

public class Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentval = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currentval++;
            }else{
                if(currentval > max)
                    max = currentval;
                currentval = 0;
            }
        }
        if(currentval > max)
            max = currentval;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,0,1}));
    }
}
