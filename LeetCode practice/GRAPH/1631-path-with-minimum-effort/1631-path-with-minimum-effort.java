class Solution {
    static int direction[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int minimumEffortPath(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;

        int dist[][] = new int[m][n];
        for (int i[] : dist) {
            Arrays.fill(i, Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        dist[0][0] = 0;
        pq.add(new int[] { 0, 0, 0 });
        while (!pq.isEmpty()) {
            int curr[] = pq.poll();
            int diff = curr[0];
            int r = curr[1];
            int c = curr[2];

            if (diff != dist[r][c]) {
                continue;
            }
            if (r == m - 1 && c == n - 1) {
                return diff;
            }
            for (int dir[] : direction) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                int nextdiff = Math.max(diff, Math.abs(heights[r][c] - heights[nr][nc]));
                if (nextdiff < dist[nr][nc]) {
                    dist[nr][nc] = nextdiff;
                    pq.add(new int[] { dist[nr][nc], nr, nc });
                }

            }
        }
        return -1;

    }
}