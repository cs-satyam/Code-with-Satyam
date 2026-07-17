class Solution {
    public int change(int amount, int[] coins) {

        int[][] dp = new int[coins.length][amount + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(coins.length - 1, amount, coins, dp);
    }

    int solve(int n, int amount, int[] coins, int[][] dp) {

        if (n == 0) {
            return (amount % coins[0] == 0) ? 1 : 0;
        }

        if (dp[n][amount] != -1)
            return dp[n][amount];

        int notTake = solve(n - 1, amount, coins, dp);

        int take = 0;
        if (coins[n] <= amount)
            take = solve(n, amount - coins[n], coins, dp);

        return dp[n][amount] = take + notTake;
    }
}