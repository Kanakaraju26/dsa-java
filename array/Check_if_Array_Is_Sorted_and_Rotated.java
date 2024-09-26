package array;

public class Check_if_Array_Is_Sorted_and_Rotated {
    public static boolean check(int[] nums) {
        int count = 0;
 
         for (int i = 0; i < nums.length; i++) {
             if (nums[i] > nums[(i + 1) % nums.length]) {
                 count++;
             }
             
             if (count > 1) {
                 return false;
             }
         }
         
         return true;  
     }
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        System.out.println(check(arr));
    }
}
