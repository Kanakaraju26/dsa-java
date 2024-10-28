package binarysearch.bson1d;

public class find_Peak_Element {
    public static int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        if(nums.length==2) return nums[0]>nums[1]?0:1;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid]>nums[mid+1]) right = mid;
            else left = mid+1;
        }
        return left;
    }
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[] {1,2,4,5,7,8}));
    }
}
