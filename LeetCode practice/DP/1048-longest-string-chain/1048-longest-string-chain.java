class Solution {
    public int longestStrChain(String[] words) {

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        int n = words.length;

        int[][] dp = new int[n][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(words, 0, -1, dp);
    }

    public int solve(String[] words, int i, int prev, int[][] dp) {

        if (i == words.length) {
            return 0;
        }

        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        // Not take
        int notTake = solve(words, i + 1, prev, dp);

        // Take
        int take = 0;

        if (prev == -1 || isPredecessor(words[prev], words[i])) {
            take = 1 + solve(words, i + 1, i, dp);
        }

        return dp[i][prev + 1] = Math.max(take, notTake);
    }

    public boolean isPredecessor(String prev, String curr) {

        if (curr.length() != prev.length() + 1) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < prev.length() && j < curr.length()) {

            if (prev.charAt(i) == curr.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == prev.length();
    }
}