package graph.learning;

import java.util.ArrayList;
import java.util.List;

public class print_adjacency_list {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // Initialize the adjacency list
        List<List<Integer>> adjList = new ArrayList<>();

        // Create an empty list for each vertex
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Populate the adjacency list using the edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            // Add the connection for both vertices (undirected graph)
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        return adjList;
    }
}
