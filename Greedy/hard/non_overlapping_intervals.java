package Greedy.hard;

import java.util.Arrays;

public class non_overlapping_intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
          Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int prevEnd = intervals[0][1]; // Keep track of the end time of the last non-overlapping interval

        for (int i = 1; i < intervals.length; i++) {
            // Check for overlap
            if (intervals[i][0] < prevEnd) {
                count++; // Increment overlap count
            } else {
                prevEnd = intervals[i][1]; // Update the end time to the current interval's end
            }
        }

        return count;
    }
}
