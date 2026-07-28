package Graph;

import java.util.*;

public class NumberofProvinces {

    // BFS Traversal
    public void bfs(int start, boolean[] vis, int[][] adj) {

        int n = adj.length;
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {

            int front = q.remove();

            for (int j = 0; j < n; j++) {

                if (adj[front][j] == 1 && !vis[j]) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }

    // Main Logic
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (!vis[i]) {
                bfs(i, vis, isConnected);
                count++;
            }
        }

        return count;
    }

    // Driver Code
    public static void main(String[] args) {

        NumberofProvinces obj = new NumberofProvinces();

        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        int ans = obj.findCircleNum(isConnected);

        System.out.println("Number of Provinces = " + ans);
    }
}