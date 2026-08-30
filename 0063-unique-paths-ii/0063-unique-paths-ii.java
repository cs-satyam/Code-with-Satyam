class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1)
            return 0;

        int dp[][] = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return f(m - 1, n - 1, grid, dp);

    }

    public int f(int m, int n, int grid[][], int dp[][]) {

        if (m == 0 && n == 0)
            return 1;
        else if (m < 0 || n < 0 || grid[m][n] == 1)

            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        return dp[m][n] = f(m - 1, n, grid, dp) + f(m, n - 1, grid, dp);

    }
}