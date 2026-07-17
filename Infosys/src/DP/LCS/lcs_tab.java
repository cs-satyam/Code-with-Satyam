package DP.LCS;

public class lcs_tab {
    public static void main(String[] args) {
        String s1 = "abcdb";
        String s2 = "bcacdhb";
        int n = s1.length();
        int m = s2.length();

        // FIX 1: Increase size by 1 to accommodate 0 to n and 0 to m
        int dp[][] = new int[n + 1][m + 1];

        // FIX 2: Removed redundant and broken initialization loops.
        // Java primitives default to 0 automatically.

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // FIX 3: Indices i and j now safely map up to n and m
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // Prints the correct Longest Common Subsequence length
        System.out.println(dp[n][m]);
    }
}
