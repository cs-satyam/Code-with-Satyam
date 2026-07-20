package DP.String_DP;

public class regularExpressionMatching {

    static Boolean[][] dp;

    public static void main(String[] args) {

        String s = "ab";
        String p = "a*";

        System.out.println(isMatch(s, p));
    }

    static boolean isMatch(String s, String p) {

        dp = new Boolean[s.length() + 1][p.length() + 1];

        return f(s.length() - 1, p.length() - 1, s, p);
    }

    static boolean f(int i, int j, String s, String p) {

        // Both finished
        if (i < 0 && j < 0)
            return true;

        // Pattern finished
        if (j < 0)
            return false;

        // String finished
        if (i < 0) {

            while (j >= 0) {

                if (p.charAt(j) != '*')
                    return false;

                j -= 2;
            }

            return true;
        }

        if (dp[i][j] != null)
            return dp[i][j];

        boolean ans;

        // Current characters match
        if (p.charAt(j) == '.' || s.charAt(i) == p.charAt(j)) {

            ans = f(i - 1, j - 1, s, p);

        }
        // Current pattern character is '*'
        else if (p.charAt(j) == '*') {

            // Skip x*
            ans = f(i, j - 2, s, p);

            // Use x*
            if (j > 0 &&
                    (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i))) {

                ans = ans || f(i - 1, j, s, p);
            }

        } else {

            ans = false;
        }

        return dp[i][j] = ans;
    }
}