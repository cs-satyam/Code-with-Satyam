package DP.Knapsack0_1;

import java.util.Arrays;

public class Knapsack01_memo {

    public static void main(String[] args) {

        int[] wt = {1, 3, 4, 5};     // Weights
        int[] val = {1, 4, 5, 7};    // Values
        int capacity = 7;
        int dp[][]=new int[wt.length+1][capacity+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = knapsack(wt, val, capacity,wt.length,dp);

        System.out.println("Maximum Profit = " + ans);
    }

    static int knapsack(int[] wt, int[] val, int w, int n,int dp[][]) {

        if(w==0||n==0){
            return 0;

        }
        if(dp[n][w]!=-1) return dp[n-1][w];

        if(wt[n-1]<=w){
            int include=val[n-1]+knapsack(wt,val,w-wt[n-1],n-1,dp);
            int exclude= knapsack(wt,val,w,n-1,dp);
            dp[n][w]= Math.max(include,exclude);
        }else{
            dp[n][w]= knapsack(wt,val,w,n-1,dp);
        }
        return dp[n][w];

    }
}