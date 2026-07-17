package DP.LCS;

import java.util.Arrays;

public class lcsMemo {
    public static void main(String[] args) {
        String s1 = "abcdb";
        String s2 = "bcacdhb";
        printLCS l = new printLCS();

        int r = lcs(s1, s2);
        System.out.println(r);
    }

    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n][m];

        for (int r[] : dp)
            Arrays.fill(r, -1);

        return f(n - 1, m - 1, s1, s2, dp);
    }

    static int f(int i, int j, String s1, String s2, int dp[][]) {
        if (i < 0 || j < 0) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = 1 + f(i - 1, j - 1, s1, s2, dp);
        else
            return dp[i][j] = Math.max(
                    f(i - 1, j, s1, s2, dp),
                    f(i, j - 1, s1, s2, dp));
    }
}
