package DP.Knapsack0_1;

import java.util.Arrays;

public class Knapsack01 {

    public static void main(String[] args) {

        int[] wt = {1, 3, 4, 5};     // Weights
        int[] val = {1, 4, 5, 7};    // Values
        int capacity = 7;

        int ans = knapsack(wt, val, capacity);

        System.out.println("Maximum Profit = " + ans);
    }

    static int knapsack(int[] wt, int[] val, int capacity) {

        int n = wt.length;

        // dp[i][j] = maximum value using first i items with capacity j
        int[][] dp = new int[n + 1][capacity + 1];

        // Fill DP Table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {

                if (wt[i - 1] <= j) {

                    int includeProfit = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    int excludeProfit = dp[i - 1][j];

                    dp[i][j] = Math.max(includeProfit, excludeProfit);

                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        // Print DP Table
        System.out.println("DP Table:");
        for (int[] row : dp) {
            System.out.println(Arrays.toString(row));
        }

        return dp[n][capacity];
    }
}