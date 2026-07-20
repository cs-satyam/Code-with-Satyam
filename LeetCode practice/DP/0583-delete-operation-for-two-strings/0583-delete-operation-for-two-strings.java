class Solution {
    public int minDistance(String word1, String word2) {
        int lcs = lcs(word1, word2);
        return lcs;
        // return word1.length() + word2.length() - 2 * lcs;
    }

    static int lcs(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return f(n - 1, m - 1, s, t, dp);

    }

    private static int f(int i, int j, String s, String t, int[][] dp) {
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;
        ;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] = f(i - 1, j - 1, s, t, dp);
        } else {
            int delete = 1 + f(i - 1, j, s, t, dp);
            int insert = 1 + f(i, j - 1, s, t, dp);           
            dp[i][j] =  Math.min(delete, insert);

        }
        return dp[i][j];
    }
}