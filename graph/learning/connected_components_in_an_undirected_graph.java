package graph.learning;

import java.util.ArrayList;
import java.util.Collections;

public class connected_components_in_an_undirected_graph {
    public ArrayList<ArrayList<Integer>> connectedcomponents(int v, int[][] edges) {
        ArrayList<ArrayList<Integer>> answer= new ArrayList<>();
        boolean[] visited= new boolean[v];
        ArrayList<ArrayList<Integer>> adjList=findAdjacencyList(v,edges);
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                ArrayList<Integer> connectedComp=new ArrayList<>();
                dfsTraversal(i,adjList,visited,connectedComp);
                Collections.sort(connectedComp);
                answer.add(connectedComp);
            }
        }
        return answer;
    }
    public ArrayList<ArrayList<Integer>> findAdjacencyList(int V,int[][] edges){
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        return adjList;
    }
    public void dfsTraversal(int source, ArrayList<ArrayList<Integer>> adjList, boolean[] visited,ArrayList<Integer> dfsResult){
        visited[source]=true;
        dfsResult.add(source);
        //Find the neighbours of the source
        ArrayList<Integer> neighbours=adjList.get(source);
        for(int i=0;i<neighbours.size();i++){
            int vertex=neighbours.get(i);
            if(!visited[vertex]){
                dfsTraversal(vertex,adjList,visited,dfsResult);
            }
        }
    }
}
