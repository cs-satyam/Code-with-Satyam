import java.util.*;

class Solution {
  static int[][] directions = {{-1, 0},
                                {1, 0},
                                {0, -1},
                                {0, 1}};
    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;

        // dist[i][j] = minimum time to reach (i, j)
        int[][] dist = new int[m][n];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // {time, row, col}
PriorityQueue<int[]> pq = new PriorityQueue<>( Comparator.comparingInt(a -> a[0]) );

        dist[0][0] = 0;
        pq.offer(new int[]{0, 0, 0});

      
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int time = curr[0];
            int r = curr[1];
            int c = curr[2];

            // Ignore outdated state
            if (time != dist[r][c]) {
                continue;
            }

            // Reached destination
            if (r == m - 1 && c == n - 1) {
                return time;
            }

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                // We can enter the next room only at/after moveTime[nr][nc]
                int nextTime = Math.max(time, moveTime[nr][nc]) + 1;

                if (nextTime < dist[nr][nc]) {
                    dist[nr][nc] = nextTime;
                    pq.offer(new int[]{nextTime, nr, nc});
                }
            }
        }

        return -1;
    }
}