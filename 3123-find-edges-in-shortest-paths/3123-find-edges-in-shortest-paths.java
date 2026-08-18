class Solution {
    public boolean[] findAnswer(int n, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];

            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }

        int[] dist0 = dijkstra(0, adj);
        int[] distN = dijkstra(n - 1, adj);

        int shortest = dist0[n - 1];
        boolean[] ans = new boolean[edges.length];

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            boolean path1 =
                dist0[u] != Integer.MAX_VALUE &&
                distN[v] != Integer.MAX_VALUE &&
                dist0[u] + w + distN[v] == shortest;

            boolean path2 =
                dist0[v] != Integer.MAX_VALUE &&
                distN[u] != Integer.MAX_VALUE &&
                dist0[v] + w + distN[u] == shortest;

            ans[i] = path1 || path2;
        }

        return ans;
    }

    private int[] dijkstra(int src, List<List<int[]>> adj) {
        int n = adj.size();

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            Comparator.comparingInt(a -> a[0])
        );

        dist[src] = 0;
        pq.offer(new int[]{0, src});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int d = curr[0];
            int node = curr[1];

            if (d > dist[node]) {
                continue;
            }

            for (int[] e : adj.get(node)) {
                int next = e[0];
                int w = e[1];

                if (d + w < dist[next]) {
                    dist[next] = d + w;
                    pq.offer(new int[]{dist[next], next});
                }
            }
        }

        return dist;
    }
}