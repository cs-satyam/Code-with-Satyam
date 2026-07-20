import java.util.Arrays;

class Solution {
    public int minDistance(String word1, String word2) {
        return lcs(word1, word2);
    }

    int lcs(String s, String t) {
        int n = s.length();
        int m = t.length();
        
         if (n == 0) return m;
        if (m == 0) return n;

        int dp[][] = new int[n][m];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }

        return f(n - 1, m - 1, s, t, dp);
    }

    int f(int i, int j, String s1, String s2, int dp[][]) {
        // FIX 3: Return the remaining operations count if one string finishes early
        if (i < 0) return j + 1;
        if (j < 0) return i + 1;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = f(i - 1, j - 1, s1, s2, dp);
        } else {
            // Mapping: Delete, Insert, Replace operations respectively
            return dp[i][j] = Math.min(
                    1 + f(i - 1, j, s1, s2, dp),
                    Math.min(1 + f(i, j - 1, s1, s2, dp),
                             1 + f(i - 1, j - 1, s1, s2, dp))
            );
        }
    }
}
