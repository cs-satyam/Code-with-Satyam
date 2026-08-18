package OA.DP.LCS;

public class printLCS {
    public static void main(String[] args) {
        String s1 = "abcdb";
        String s2 = "bcacdhb";

        int n = s1.length();
        int m = s2.length();

        // Step 1: Build the OA.DP Table
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Step 2: Backtrack using a for loop
        StringBuilder lcsString = new StringBuilder();
        int i = n;
        int j = m;

        // Maximum total moves possible cannot exceed n + m
        for (int step = 0; step < (n + m); step++) {
            // Stop immediately if we hit the boundary of either string
            if (i == 0 || j == 0) {
                break;
            }

            // If characters match, add to sequence and move up-left diagonally
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcsString.append(s1.charAt(i - 1));
                i--;
                j--;
            }
            // Otherwise, step towards the maximum adjacent cell value
            else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--; // Move up
            } else {
                j--; // Move left
            }
        }

        // Reverse because we backtracked from the end to the start
        lcsString.reverse();

        System.out.println("LCS Length: " + dp[n][m]);
        System.out.println("LCS String: " + lcsString.toString());
    }
}
