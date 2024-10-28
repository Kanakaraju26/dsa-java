package binarysearch.bson1d;

public class single_element_in_a_sorted_array {
    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(mid%2==1) mid--;
            if(nums[mid]==nums[mid+1]){
                left = mid + 2;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[] {2,4,6,8,9}));
    }
}
