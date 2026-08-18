import java.util.*;
class Solution {
    public int tallestBillboard(int[] rods) {
        int sum = 0;

        for (int rod : rods) {
            sum += rod;
        }

        //dp[i][diff + sum]
        // diff can range from -sum to +sum
        int[][]dp = new int[rods.length][2 * sum + 1];

        for (int[] row :dp) {
            Arrays.fill(row, -1);
        }

        return f(rods, 0, 0,dp, sum);
    }

    private int f(int[] rods, int i, int diff, int[][]dp, int sum) {

        // All rods processed
        if (i == rods.length) {
            return diff == 0 ? 0 : Integer.MIN_VALUE;
        }

        // Shift diff because it can be negative
        int index = diff + sum;

        if (dp[i][index] != -1) {
            return dp[i][index];
        }

        int rod = rods[i];

        // 1. Don't use rod
        int skip = f(rods, i + 1, diff,dp, sum);

        // 2. Put rod on left side
        int left = f(rods, i + 1, diff + rod,dp, sum);

        // 3. Put rod on right side
        int right = f(rods, i + 1, diff - rod,dp, sum);

        // If we put rod on the side that increases
        // the shorter side, add its contribution.
        if (right != Integer.MIN_VALUE) {
            right += rod;
        }

        int ans = Math.max(skip, Math.max(left, right));

        return dp[i][index] = ans;
    }
}