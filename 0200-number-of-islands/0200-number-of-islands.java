class Solution {

    public void dfs(int row, int col, boolean[][] vis, char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (row < 0 || col < 0 || row >= m || col >= n ||
            grid[row][col] == '0' || vis[row][col]) {
            return;
        }

        vis[row][col] = true;

        dfs(row - 1, col, vis, grid); // up
        dfs(row + 1, col, vis, grid); // down
        dfs(row, col - 1, vis, grid); // left
        dfs(row, col + 1, vis, grid); // right
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    dfs(i, j, vis, grid);
                    count++;
                }
            }
        }

        return count;
    }
}