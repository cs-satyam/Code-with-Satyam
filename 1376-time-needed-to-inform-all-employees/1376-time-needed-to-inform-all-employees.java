class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();

        }

        for (int i = 0; i < n; i++) {

            if (manager[i] != -1) {

                adj[manager[i]].add(i);

            }

        }

        return dfs(headID, adj, informTime);

    }

    private int dfs(int node, List<Integer>[] adj, int[] informTime) {

        int maxTime = 0;

        for (int child : adj[node]) {

            maxTime = Math.max(maxTime, dfs(child, adj, informTime));

        }

        return informTime[node] + maxTime;
    }
}