package DP.Knapsack0_1;

import java.util.Arrays;

public class coinChangeII {
    static  int INF=100000000;
    public static void main(String[] args) {
        int a[] = {1, 2, 5};
        int t = 5;
        int dp[][]= new int[a.length][t+1];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }
        int ans = minimumWay(a.length - 1, t, a,dp);

        System.out.println(ans);
    }

    private static int minimumWay(int n, int t, int[] a, int[][] dp) {

        if (n == 0) {
            if (t % a[0] == 0)
                return 1;
            return 0;
        }

        if (dp[n][t] != -1)
            return dp[n][t];

        int notTake = minimumWay(n - 1, t, a, dp);

        int take = 0;
        if (a[n] <= t) {
            take = minimumWay(n, t - a[n], a, dp);
        }

        dp[n][t] = take+ notTake;

        return dp[n][t];
    }

}
