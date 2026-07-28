package Graph;

import java.util.ArrayList;
import java.util.List;

public class AdjancencyListGraph {
    public static void main(String[] args) {

        int [][]graph={{1,2},{2,3},{3,4},{4,5},{5,1},{1,3},{3,5}};

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
           adj.add(new ArrayList<>());}
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                if(graph[i][j]!=0){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        System.out.println(adj);
    }
}
