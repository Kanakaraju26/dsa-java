package graph.problem_dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class number_of_provinces {
    public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    boolean[] visited = new boolean[n];
    int provinceCount = 0;

    for (int i = 0; i < n; i++) {
        if (!visited[i]) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            
            while (!queue.isEmpty()) {
                int city = queue.poll();
                visited[city] = true;

                for (int j = 0; j < n; j++) {
                    if (isConnected[city][j] == 1 && !visited[j]) {
                        queue.add(j);
                    }
                }
            }
            provinceCount++;
        }
    }
    return provinceCount;
    }

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int prov = 0;
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                 prov++;
            }
        }
        return prov;
    }
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        // Mark the current node as visited and add it to the traversal list
        visited[node] = true;
        // Traverse all neighbors of the current node
       for (int neighbor = 0; neighbor < adj.get(node).size(); neighbor++) {
        if (adj.get(node).get(neighbor) == 1 && !visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
}
