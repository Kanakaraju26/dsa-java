package binarysearch.bsonans;

public class kth_missing_positive_number {
    public static int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[] {1,2,4,5,7,8}, 6));
    }
}
