package Graph.formate;

import java.util.ArrayList;

public class Undirectedgraph {
    public static void main(String[] args) {

        int[][] graph = {
                {0, 5, 0, 0, 0},
                {5, 0, 1, 3, 0},
                {0, 1, 0, 1, 4},
                {0, 3, 1, 0, 0},
                {0, 0, 4, 0, 0}
        };

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();


        for (int i = 0; i < graph.length; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < graph.length; i++) {
            for (int j = i + 1; j < graph.length; j++) {
                if (graph[i][j] != 0) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        System.out.println(adj);
    }
}