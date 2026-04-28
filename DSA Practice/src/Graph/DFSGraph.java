package Graph;

public class DFSGraph {

    public static void dfs(int[][] graph, int curr, boolean[] visited) {

        System.out.print(curr + " ");
        visited[curr] = true;

        for (int j = 0; j < graph.length; j++) {
            if (graph[curr][j] != 0 && !visited[j]) {
                dfs(graph, j, visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        int[][] graph = {
                {0, 5, 0, 0, 0},
                {5, 0, 1, 3, 0},
                {0, 1, 0, 1, 4},
                {0, 3, 1, 0, 0},
                {0, 0, 4, 0, 0}
        };

        boolean[] visited = new boolean[V];
        dfs(graph, 0, visited);
    }
}