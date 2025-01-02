package graph.learning;

import java.util.ArrayList;
import java.util.Stack;

public class depth_first_traversal_for_a_graph {
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
          // Initialize a list to store the DFS traversal
        int V = adj.size();
        ArrayList<Integer> dfsTraversal = new ArrayList<>();
        
        // Create a visited array to keep track of visited vertices
        boolean[] visited = new boolean[V];
        
        // Use a stack for iterative DFS
        Stack<Integer> stack = new Stack<>();
        
        // Start DFS from vertex 0
        stack.push(0);
        
        while (!stack.isEmpty()) {
            // Pop the top node from the stack
            int currentNode = stack.pop();
            
            // If the node is not visited, process it
            if (!visited[currentNode]) {
                visited[currentNode] = true;
                dfsTraversal.add(currentNode);
                
                // Add all unvisited neighbors to the stack in reverse order
                // This ensures the left-to-right order of traversal
                for (int i = adj.get(currentNode).size() - 1; i >= 0; i--) {
                    int neighbor = adj.get(currentNode).get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        
        return dfsTraversal;
    }
}
