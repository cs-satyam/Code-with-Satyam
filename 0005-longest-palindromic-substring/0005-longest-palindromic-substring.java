class Solution {
    public String longestPalindrome(String s) {
        String t = new StringBuilder(s).reverse().toString();
        return lps(s, t);
    }

    String lps(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];
        int maxLen = 0;
        int endIndex = 0; // Tracks where the optimal palindrome ends in s

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    
                    if (dp[i][j] > maxLen) {
                        int originalStartIdx = i - dp[i][j];
                        int reversedStartIdx = n - j;
                        
                        // Verify index symmetry to confirm it is a valid palindrome
                        if (originalStartIdx == reversedStartIdx) {
                            maxLen = dp[i][j];
                            endIndex = i;  
                        }
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

         return s.substring(endIndex - maxLen, endIndex);
    }
}
