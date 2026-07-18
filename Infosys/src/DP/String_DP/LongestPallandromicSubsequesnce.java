package DP.String_DP;

public class LongestPallandromicSubsequesnce {
    public static void main(String[] args) {
        String s="bbbab";
        String t = new StringBuilder(s).reverse().toString();
        int r= lcs(s,t);
        System.out.println(r);

    }
    static int lcs(String s , String t){
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // FIX 3: Indices i and j now safely map up to n and m
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}
