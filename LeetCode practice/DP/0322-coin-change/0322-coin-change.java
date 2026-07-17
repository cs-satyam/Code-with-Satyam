class Solution {
   static int INF=100000000;
    public int coinChange(int[] a, int t) {
        int dp[][]= new int[a.length][t+1];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }
        int ans = minimumWay(a.length - 1, t, a,dp);
        return ans >= INF ? -1 : ans;
    }

        private  int minimumWay(int n, int t, int[] a, int[][] dp) {

        if (n == 0) {
            if (t % a[0] == 0)
                return t / a[0];
            return INF;
        }

        if (dp[n][t] != -1)
            return dp[n][t];

        int notTake = minimumWay(n - 1, t, a, dp);

        int take = INF;
        if (a[n] <= t) {
            take = 1 + minimumWay(n, t - a[n], a, dp);
        }

        dp[n][t] = Math.min(take, notTake);

        return dp[n][t];
    }
}