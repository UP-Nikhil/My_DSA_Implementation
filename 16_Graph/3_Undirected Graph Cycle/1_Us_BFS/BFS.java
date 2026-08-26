
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

   private static boolean bfs(int start,  List<List<Integer>> adj, boolean[] visited) {

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(start, -1));
        visited[start] = true;

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            int node = curr.node;
            int parent = curr.parent;

            for (int num : adj.get(node)) {

                if (!visited[num]) {

                    visited[num] = true;

                    q.add(new Pair(num, node));
                }
                else if (num != parent) {

                    return true;
                }
            }
        }

        return false;
    }

    // int
    public  static boolean isCycle(int V, int[][] edges) {

        // convert graph matrix into list graph

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
                if (bfs(i, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
         int V = 4;

        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 2}
        };
       System.out.println(isCycle(V, edges));
    }
}
