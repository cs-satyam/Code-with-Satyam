class Solution {

    boolean f(String s, int i, int j, Boolean dp[][]) {
        if (i >= j)
            return true;

        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = f(s, i + 1, j - 1,dp);
        }
        return dp[i][j] = false;
    }

    public int countSubstrings(String s) {
        int n = s.length();
        Boolean dp[][] = new Boolean[n][n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (f(s, i, j, dp))
                    c++;
            }
        }
        return c;
    }
}