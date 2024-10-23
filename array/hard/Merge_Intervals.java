package hard;

import java.util.*;
public class Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        // Step 2: Iterate through intervals
        for (int[] interval : intervals) {
            // If the answer list is empty or there's no overlap, add the interval
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(interval);
            } else {
                // Merge the current interval with the last interval in ans
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }

        // Convert the list of intervals into a 2D array and return
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[][] arr = merge(new int[][] {{1,2},{4,5},{7,8}});
    }
}
