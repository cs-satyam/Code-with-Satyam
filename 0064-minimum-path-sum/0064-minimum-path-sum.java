import java.util.*;

class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return f(grid, m - 1, n - 1, dp);
    }

    static int f(int[][] grid, int i, int j, int[][] dp) {

        // Starting cell
        if (i == 0 && j == 0) {
            return grid[0][0];
        }

        // Outside the grid
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }

        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Come from up
        int up = f(grid, i - 1, j, dp);

        // Come from left
        int left = f(grid, i, j - 1, dp);

        dp[i][j] = grid[i][j] + Math.min(up, left);

        return dp[i][j];
    }
}