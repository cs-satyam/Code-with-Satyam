package Interview.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Djkastra {

    public ArrayList<Integer> dijkastra(int V, int [][]edges , int src ){
        ArrayList<Integer> ans= new ArrayList<>();

        ArrayList<ArrayList<int []>> adj = new ArrayList<>();


        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];

            adj.get(u).add(new int[] {wt, v});
            adj.get(v).add(new int []{wt,u});
        }
        int dis[]= new int[V];

        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        Arrays.fill(dis,Integer.MAX_VALUE);
         dis[0]=0;
         pq.add(new int []{0,src});


         while(!pq.isEmpty()){
             int [] curr = pq.poll();

             int d=curr[0];
             int u=curr[1];

             if(d>dis[u]) continue;
             for(int [] edge:adj.get(u)){
                 int v=edge[0];
                 int wt = edge[1];

                 if(d+wt<dis[v]){
                     dis[v]=d+wt;
                     pq.add(new int []{dis[v],v});

                 }
             }
         }

        for (int d : dis) {
            ans.add(d);
        }

        return ans;
    }
}
