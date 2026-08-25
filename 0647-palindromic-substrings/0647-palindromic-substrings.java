class Solution {
    boolean f(String s, int i, int j) {
        if (i >= j)
            return true;
        if (s.charAt(i) == s.charAt(j)) {
            return f(s, i + 1, j - 1);
        }
        return false;
    }

    public int countSubstrings(String s) {
        int n = s.length();
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (f(s, i, j))
                    c++;
            }
        }
        return c;
    }
}