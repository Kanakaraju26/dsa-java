package graph.problem_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class flood_fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         int originalColor = image[sr][sc];
    
    // If the starting pixel already has the new color, return the image as is
    if (originalColor == color) return image;

    int m = image.length, n = image[0].length;
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{sr, sc});

    // Directions array for up, down, left, right traversal
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    while (!queue.isEmpty()) {
        int[] current = queue.poll();
        int x = current[0], y = current[1];

        // Change the color of the current cell
        image[x][y] = color;

        // Check all adjacent cells
        for (int[] dir : directions) {
            int newX = x + dir[0], newY = y + dir[1];

            // Validate cell boundaries and color match
            if (newX >= 0 && newX < m && newY >= 0 && newY < n && image[newX][newY] == originalColor) {
                queue.add(new int[]{newX, newY});
            }
        }
    }

    return image;
    }
}
