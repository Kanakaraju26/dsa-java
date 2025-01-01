package graph.learning;

public class graph_and_vertices {
    static long count(int n) {
        // code here
        if (n <= 2) {
            return n;
        }
        long edges = (n * (n - 1)) / 2L;
        long ans = (long) Math.pow(2, edges);

        return ans;
    }
}
