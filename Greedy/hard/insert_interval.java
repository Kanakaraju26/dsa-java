package Greedy.hard;

import java.util.ArrayList;
import java.util.List;

public class insert_interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        // Step 1: Add all intervals before newInterval starts
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Step 2: Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // Update start
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // Update end
            i++;
        }
        result.add(newInterval); // Add the merged interval

        // Step 3: Add all intervals after newInterval ends
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        // Convert result list to array
        return result.toArray(new int[result.size()][]);
    }
}
