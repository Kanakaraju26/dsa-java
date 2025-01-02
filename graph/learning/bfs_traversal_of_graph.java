package graph.learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_traversal_of_graph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        // Initialize a list to store the BFS traversal
        ArrayList<Integer> bfsTraversal = new ArrayList<>();
        
        // Create a visited array to keep track of visited nodes
        boolean[] visited = new boolean[V];
        
        // Initialize a queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        
        // Start BFS from vertex 0
        queue.add(0);
        visited[0] = true;
        
        while (!queue.isEmpty()) {
            // Dequeue a vertex and add it to the result
            int node = queue.poll();
            bfsTraversal.add(node);
            
            // Traverse all adjacent vertices
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        
        return bfsTraversal;
    }
}
