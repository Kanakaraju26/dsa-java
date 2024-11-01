package binarysearch.bsonans;

public class k_th_element_of_two_sorted_array {
    public static long kthElement(int k, int a[], int b[]) {
        if (a.length > b.length) return kthElement(k,b,a);

        int left = k; // length of left half

        // apply binary search:
        int low = Math.max(0, k - b.length), high = Math.min(k, a.length);
        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;
            // calculate l1, l2, r1, and r2
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < a.length) r1 = a[mid1];
            if (mid2 < b.length) r2 = b[mid2];
            if (mid1 - 1 >= 0) l1 = a[mid1 - 1];
            if (mid2 - 1 >= 0) l2 = b[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }

            // eliminate the halves:
            else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(kthElement(3, new int[]{2,3,4,5}, new int[]{1,7,8,9}));
    }
}
