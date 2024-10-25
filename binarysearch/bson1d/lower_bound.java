package binarysearch.bson1d;

public class lower_bound {
    static int findFloor(long arr[], int n, long x) {
        int left = 0;
    int right = n - 1;
    int ans = -1; // Initialize as -1 to indicate "not found" if all elements are > x
    
    while (left <= right) {
        int mid = (left + right) / 2;
        
        if (arr[mid] <= x) {
            ans = mid;  // Update answer with the current mid if arr[mid] <= x
            left = mid + 1;  // Move to the right to find the closest value
        } else {
            right = mid - 1;  // Move to the left if arr[mid] > x
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        System.out.println(findFloor(new long[] {3,4,5,8,9}, 5, 8));
    }
}
