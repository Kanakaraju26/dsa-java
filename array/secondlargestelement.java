package array;

import java.util.TreeSet;

public class secondlargestelement {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        if (arr.length < 2) {
            return -1;
        }

        // Use a TreeSet to store distinct elements in sorted order
        TreeSet<Integer> set = new TreeSet<>();

        // Add all elements to the set (this will remove duplicates automatically)
        for (int num : arr) {
            set.add(num);
        }

        // Check if there are fewer than 2 distinct elements
        if (set.size() < 2) {
            return -1;
        }

        // Remove the largest element
        set.pollLast();

        // The next largest element is now the second-largest
        return set.last();
    }
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,7,2,8};
        System.out.println(getSecondLargest(arr));
    }
}
