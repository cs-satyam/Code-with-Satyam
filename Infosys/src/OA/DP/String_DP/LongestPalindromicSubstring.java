package DP.String_DP;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "bbbab";
        String t = new StringBuilder(s).reverse().toString();

        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];
        int maxLen = 0;
        int maxRow = 0;
        int maxCol = 0;

        // Step 1: Build the DP Matrix and capture the peak cell coordinates
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];

                    // Verify if the matching common substring maps to the exact same position in the original string
                    if (dp[i][j] > maxLen) {
                        int originalStartIdx = i - dp[i][j];
                        int reversedStartIdx = n - j;

                        if (originalStartIdx == reversedStartIdx) {
                            maxLen = dp[i][j];
                            maxRow = i;
                            maxCol = j;
                        }
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        // Step 2: Backtrack from the peak cell using a for loop
        StringBuilder lpsString = new StringBuilder();
        int i = maxRow;
        int j = maxCol;

        for (int step = 0; step < maxLen; step++) {
            if (i == 0 || j == 0) {
                break;
            }

            lpsString.append(s.charAt(i - 1));
            i--;
            j--;
        }

        // Reverse since characters were read from the end of the substring to the beginning
        lpsString.reverse();

        System.out.println("LPSubstr Length: " + maxLen);
        System.out.println("LPSubstr String: " + lpsString.toString());
    }
}
