import java.util.*;

class Solution {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {

        int n = passingFees.length;

        // Step 1: Build graph
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            int u = e[0], v = e[1], t = e[2];
            graph[u].add(new int[]{v, t});
            graph[v].add(new int[]{u, t});
        }

        // Step 2: Priority Queue (cost, time, node)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.offer(new int[]{passingFees[0], 0, 0});

        // Step 3: Track best time to reach node
        int[] bestTime = new int[n];
        Arrays.fill(bestTime, Integer.MAX_VALUE);
        bestTime[0] = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int cost = curr[0];
            int time = curr[1];
            int node = curr[2];

            // Reached destination
            if (node == n - 1) return cost;

            for (int[] nei : graph[node]) {
                int next = nei[0];
                int t = nei[1];

                int newTime = time + t;
                int newCost = cost + passingFees[next];

                // Check time constraint
                if (newTime > maxTime) continue;

                // Only proceed if better time
                if (newTime < bestTime[next]) {
                    bestTime[next] = newTime;
                    pq.offer(new int[]{newCost, newTime, next});
                }
            }
        }

        return -1;
    }
}