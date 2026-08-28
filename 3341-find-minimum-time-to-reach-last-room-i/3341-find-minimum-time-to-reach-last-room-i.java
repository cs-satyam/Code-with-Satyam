class Solution {
    static int[][] direction = { { -1, 0 }, { 1, 0 }, 
                                 { 0, -1 }, { 0, 1 } };

    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;

        int dist[][] = new int[m][n];

        for (int i[] : dist) {
            Arrays.fill(i, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        dist[0][0] = 0;
        pq.offer(new int[] { 0, 0, 0 });
        while (!pq.isEmpty()) {

            int[] curr = pq.poll();
            int time = curr[0];
            int i = curr[1];
            int j = curr[2];

            if (time != dist[i][j]) {
                continue;
            }
            if (i == m - 1 && j == n - 1) {
                return time;
            }

            for (int dir[] : direction) {

                int ni = i + dir[0];
                int nj = j + dir[1];

                if (ni < 0 || ni >= m || nj < 0 || nj >= n) {
                    continue;
                }
                int nextTime = Math.max(time, moveTime[ni][nj]) + 1;

                if (nextTime < dist[ni][nj]) {
                    dist[ni][nj] = nextTime;
                    pq.offer(new int[] { nextTime, ni, nj });
                }
            }
        }
        return 0;

    }
}