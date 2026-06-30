package Graph;

import java.util.ArrayList;
import Graph.BFSGraph.*;

public class cycleDetection {

    public  boolean detectCycle(ArrayList<BFSGraph.Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (dfs(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(ArrayList<BFSGraph.Edge>[] graph, boolean[] vis, int curr, int par) {

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            BFSGraph.Edge e = graph[curr].get(i);

            // Case 1: Visit unvisited neighbor
            if (!vis[e.dest]) {
                if (dfs(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            // Case 2: Visited neighbor that is not parent
            else if (e.dest != par) {
                return true;
            }
        }

        return false;
    }

    
}