//https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/

import java.util.ArrayList;
import java.util.List;

class DFS {
    
    // logic 
    private boolean dfs(int i, int p, List<List<Integer>> arr, boolean vis[]) {
        vis[i] = true;
        for (int num : arr.get(i)) {
            if (!vis[num]) {
                if (dfs(num, i, arr, vis)) {
                    return true;
                }
            } else if (num != p) {
                return true;
            }
        }
        return false;

    }
    
    // int 
    public boolean isCycle(int V, int[][] edges) {

        // convert graph  matrix into list graph
        
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        // Graph disconnected bhi ho sakta hai
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
    }

}