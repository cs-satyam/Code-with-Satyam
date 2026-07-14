package DP.Knapsack0_1;

import java.util.Arrays;

public class targetSubsetSum {

    public static void main(String[] args) {

        int[] a = {0, 8, 5, 2, 4};
        int target = 9;

        boolean ans = subsetSum(a, target);

        System.out.println("Subset Exists: " + ans);
    }

    static boolean subsetSum(int[] a, int target) {

        int n = a.length;

        // dp[i][j] = true if sum j can be formed using first i elements
        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base Case: Sum 0 is always possible
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {

                // Exclude current element
                dp[i][j] = dp[i - 1][j];

                // Include current element if possible
                if (j >= a[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - a[i - 1]];
                }
            }
        }

//        // Print DP Table
//        System.out.println("DP Table:");
//
//        for (boolean[] row : dp) {
//            System.out.println(Arrays.toString(row));
//        }

        return dp[n][target];
    }
}