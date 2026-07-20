class Solution {

    public boolean isMatch(String s, String p) {
        int n = p.length();
        int m = s.length();

        int[][] dp = new int[n][m];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return f(n - 1, m - 1, p, s, dp);
    }

    public boolean f(int i, int j, String p, String s, int[][] dp) {

        if (i < 0 && j < 0)
            return true;

        if (i < 0 && j >= 0)
            return false;

        if (j < 0 && i >= 0) {
            for (int k = 0; k <= i; k++) {
                if (p.charAt(k) != '*')
                    return false;
            }
            return true;
        }

        if (dp[i][j] != -1)
            return dp[i][j] == 1;

        boolean ans;

        if (p.charAt(i) == s.charAt(j) || p.charAt(i) == '?') {
            ans = f(i - 1, j - 1, p, s, dp);
        } else if (p.charAt(i) == '*') {
            ans = f(i - 1, j, p, s, dp) || f(i, j - 1, p, s, dp);
        } else {
            ans = false;
        }

        dp[i][j] = ans ? 1 : 0;
        return ans;
    }
}