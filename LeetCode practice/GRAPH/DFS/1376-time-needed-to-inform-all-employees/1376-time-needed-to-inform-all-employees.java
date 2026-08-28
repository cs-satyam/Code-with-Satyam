import java.util.*;
class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                adj.get(manager[i]).add(i);
            }
        }
        System.out.println(adj);
        return dfs(headID, 0, adj, informTime);
    }

    int dfs(int headID, int currTime, List<List<Integer>> adj, int[] informTime) {
                if(adj.get(headID).isEmpty()){
                    return currTime;
                }

                int maxTime=0;
                int newTime = currTime + informTime[headID] ;

                for(int e:adj.get(headID)){
                        maxTime= Math.max(maxTime,dfs(e, newTime, adj, informTime));
                }
                return maxTime;
    }
}