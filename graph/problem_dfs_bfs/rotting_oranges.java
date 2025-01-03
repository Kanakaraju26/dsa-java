package graph.problem_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class rotting_oranges {
    public int orangesRotting(int[][] grid) {
         if (grid == null || grid.length == 0) return -1;

    int rows = grid.length;
    int cols = grid[0].length;
    Queue<int[]> queue = new LinkedList<>();
    int freshCount = 0;

    // Initialize the queue with all rotten oranges and count fresh oranges
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (grid[i][j] == 2) {
                queue.add(new int[]{i, j}); // Add rotten orange coordinates
            } else if (grid[i][j] == 1) {
                freshCount++; // Count fresh oranges
            }
        }
    }

    // If there are no fresh oranges, return 0 (no time required)
    if (freshCount == 0) return 0;

    // Directions array for 4-directional movement
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int minutes = 0;

    // BFS traversal
    while (!queue.isEmpty()) {
        int size = queue.size();
        boolean rottenThisMinute = false;

        for (int i = 0; i < size; i++) {
            int[] orange = queue.poll();
            int x = orange[0], y = orange[1];

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                // Check if the new cell is within bounds and has a fresh orange
                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == 1) {
                    grid[newX][newY] = 2; // Rotten the fresh orange
                    queue.add(new int[]{newX, newY}); // Add to queue for the next minute
                    freshCount--; // Decrease fresh orange count
                    rottenThisMinute = true;
                }
            }
        }

        // Increment the minutes only if a fresh orange was rotted in this iteration
        if (rottenThisMinute) minutes++;
    }

    // If there are still fresh oranges, return -1
    return freshCount == 0 ? minutes : -1;
    }
}
