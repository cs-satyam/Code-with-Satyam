package Graph;

import java.util.*;

public class BFSGraph {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph, int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];

        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (Edge e : graph[curr]) {
                    if (!visited[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected graph (same weights both sides)

        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));

        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 1, 1));

        graph[1].add(new Edge(1, 3, 3));
        graph[3].add(new Edge(3, 1, 3));

        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 2, 1));

        graph[2].add(new Edge(2, 4, 4));
        graph[4].add(new Edge(4, 2, 4));

        bfs(graph, V);
    }
}

/*

        0
        |
       5
        |
        1
       / \
     1/   \3
     /     \
    2 ----- 3
    |   1
    |
    4


 0 -> 1

1 -> 0, 2, 3

2 -> 1, 3, 4

3 -> 1, 2

4 -> 2

* */