package Graph;

import java.util.ArrayList;

public class DFSGraph {


    public static void main(String[] args) {

        int[][] graph = {
                {0, 5, 0, 0, 0},
                {5, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 4},
                {0, 0, 0, 4, 0}
        };
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();



        for(int i = 0; i < graph.length; i++){
            adj.add(new ArrayList<>());
            for(int j = 0; j < graph[0].length; j++){
                if(graph[i][j] != 0){
                    adj.get(i).add(j);
                }
            }
        }
        System.out.println(adj);

        boolean[] visited = new boolean[graph.length];
        DFS(adj,visited,0);
    }

    public static void DFS(ArrayList<ArrayList<Integer>> adj, boolean [] visited,int curr){

            visited[curr] = true;

            for(int i = 0; i < adj.size(); i++){
                if(!visited[i] && adj.get(curr).contains(i)){
                    DFS(adj,visited,i);
                }
            }

    }
}