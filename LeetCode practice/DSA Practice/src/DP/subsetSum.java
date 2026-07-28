package DP;

import java.util.Arrays;

public class subsetSum {
    public static void main(String[] args) {

        int a[] = {8, -1, 2, 4};
        int target = 7;

        int dp[][] = new int[a.length][target + 1];

        for (int i = 0; i < a.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(subset(0, a, target, dp));
    }

    private static boolean subset(int i, int[] a, int target, int[][] dp) {

        if (target == 0) return true;
        if (i == a.length) return false;

        // avoid invalid index
        if ( dp[i][target] != -1) {
            return dp[i][target] == 1;
        }

        // skip
        boolean skip = subset(i + 1, a, target, dp);

        // pick (only if valid)
        boolean pick = false;
        if (target - a[i] >= 0) {
            pick = subset(i + 1, a, target - a[i], dp);
        }

        boolean ans = pick || skip;

        if (target >= 0) {
            dp[i][target] = ans ? 1 : 0;
        }

        return ans;
    }
}