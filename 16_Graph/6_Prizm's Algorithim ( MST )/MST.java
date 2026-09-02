
import java.util.*;

public class MST {

    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static int spanningTree(int V, int[][] edges) {

        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            // Undirected graph
            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.weight, b.weight));

        int[] vis = new int[V];

        int sum = 0;
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();

            int node = curr.node;
            int wt = curr.weight;

            // Agar already visited hai
            // toh skip kar do
            if (vis[node] == 1) {
                continue;
            }

            vis[node] = 1;
            sum += wt;

            // Current node ke saare neighbours
            for (Pair neighbor : adj.get(node)) {

                int num = neighbor.node;
                int w = neighbor.weight;

                if (vis[num] == 0) {
                    pq.add(new Pair(num, w));
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int V = 4;

        int[][] edges = {
                {0, 1, 1},
                {0, 2, 4},
                {1, 2, 2},
                {1, 3, 3},
                {2, 3, 5}
        };

        int answer = spanningTree(V, edges);

        System.out.println();
        System.out.println("Minimum Spanning Tree Weight = " + answer);
    }

}
