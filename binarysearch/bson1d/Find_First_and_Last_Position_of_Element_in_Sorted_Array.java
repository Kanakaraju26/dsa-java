package binarysearch.bson1d;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int left = findBound(nums, target, true);  // Find the left bound
    if (left == -1) {
        return new int[] {-1, -1};  // If target not found, return [-1, -1]
    }
    int right = findBound(nums, target, false);  // Find the right bound
    return new int[] {left, right};
}

private int findBound(int[] nums, int target, boolean isLeft) {
    int left = 0, right = nums.length - 1;
    int bound = -1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (nums[mid] == target) {
            bound = mid;  // Found target, continue search
            if (isLeft) {
                right = mid - 1;  // Narrow search to the left half
            } else {
                left = mid + 1;  // Narrow search to the right half
            }
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return bound;
}
}
