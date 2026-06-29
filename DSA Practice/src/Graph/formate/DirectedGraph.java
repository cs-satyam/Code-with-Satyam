package Graph.formate;

import java.util.*;

public class DirectedGraph {
    public static void main(String[] args) {

        int[][] graph = {
                {0, 5, 0, 0, 0},
                {5, 0, 1, 3, 0},
                {0, 1, 0, 1, 4},
                {0, 3, 1, 0, 0},
                {0, 0, 4, 0, 0}
        };


        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            adjlist.add(new ArrayList<>());
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] != 0) {
                    adjlist.get(i).add(j);
                }
            }
        }
        System.out.println(adjlist);

    }
}
