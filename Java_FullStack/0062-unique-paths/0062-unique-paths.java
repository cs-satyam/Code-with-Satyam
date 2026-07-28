class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
       return  f(m - 1, n - 1, dp);
        // dp[m - 1][n - 1];
    }

    public int f(int m, int n, int dp[][]) {
        if (m == 0 && n == 0) {
            return 1;
        } else if (n < 0 || m < 0)
            return 0;
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        int up = f(m - 1, n, dp);
        int left = f(m, n - 1, dp);
        return  dp[m][n] = up + left;
         

    }

}