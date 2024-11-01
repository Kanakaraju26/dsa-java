package binarysearch.bsonans;

import java.util.ArrayList;
import java.util.Arrays;

public class  Painter_Partition_Problem {
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int n = boards.size();
        
        // Determine the search boundaries
        int left = 0, right = 0;
        for (int board : boards) {
            left = Math.max(left, board);  // Longest single board
            right += board;                // Sum of all boards
        }

        int result = right;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (canPaintWithinTime(boards, n, k, mid)) {
                result = mid; // feasible, try for a smaller maximum time
                right = mid - 1;
            } else {
                left = mid + 1; // infeasible, try for a larger maximum time
            }
        }
        
        return result;
    }

    private static boolean canPaintWithinTime(ArrayList<Integer> boards, int n, int k, int maxTime) {
        int painters = 1;
        int timeSpent = 0;
        
        for (int board : boards) {
            timeSpent += board;
            
            if (timeSpent > maxTime) {
                painters++;
                timeSpent = board; // Start new painter with current board
            }
            
            if (painters > k) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println(findLargestMinDistance(new ArrayList<>(Arrays.asList(2,4,6,7,9)), 3));
    }
}
