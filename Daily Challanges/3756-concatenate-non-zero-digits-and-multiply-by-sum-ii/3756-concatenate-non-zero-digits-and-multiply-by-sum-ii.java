class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        int cnt = 0;
        for (char c : s.toCharArray())
            if (c != '0')
                cnt++;

        int[] digit = new int[cnt];
        long[] prefNum = new long[cnt + 1];
        int[] prefSum = new int[cnt + 1];
        long[] pow10 = new long[cnt + 1];

        pow10[0] = 1;

        int[] left = new int[n];
        int[] right = new int[n];

        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') {
                digit[idx++] = s.charAt(i) - '0';
            }
        }

        for (int i = 0; i < cnt; i++) {
            pow10[i + 1] = (pow10[i] * 10) % MOD;
            prefNum[i + 1] = (prefNum[i] * 10 + digit[i]) % MOD;
            prefSum[i + 1] = prefSum[i] + digit[i];
        }

        int last = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0')
                last++;
            right[i] = last;
        }

        last = cnt;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != '0')
                last--;
            left[i] = last;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = left[queries[i][0]];
            int r = right[queries[i][1]];

            if (l > r || l == cnt || r == -1) {
                ans[i] = 0;
                continue;
            }

            int len = r - l + 1;

            long x = (prefNum[r + 1] - prefNum[l] * pow10[len]) % MOD;
            if (x < 0)
                x += MOD;

            long sum = prefSum[r + 1] - prefSum[l];

            ans[i] = (int) ((x * sum) % MOD);
        }

        return ans;
    }
}