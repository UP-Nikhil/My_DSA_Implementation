//https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1

import java.util.*;

class DA {

    static class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static int[] dijkstra(int V, int[][] edges, int src) {

        // Adjacency List
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Graph create
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj.get(u).add(new Pair(v, wt));
            adj.get(v).add(new Pair(u, wt));
        }

        // Distance array
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // Min Heap
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);

        // Source
        dist[src] = 0;
        pq.add(new Pair(src, 0));

        // Dijkstra
        while (!pq.isEmpty()) {

            Pair curr = pq.remove();

            int node = curr.node;
            int distance = curr.distance;

             // ⭐ Important: stale entry skip
            if (distance > dist[node]) {
                continue;
            }

            for (Pair next : adj.get(node)) {

                int neighbor = next.node;
                int weight = next.distance;
               
                // Relaxation
                if (distance + weight < dist[neighbor]) {

                    dist[neighbor] = distance + weight;

                    pq.add(new Pair(neighbor, dist[neighbor]));
                }
            }
        }

        return dist;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int V = 5;

        int[][] edges = {
                { 0, 1, 30 },
                { 0, 3, 20 },
                { 0, 4, 5 },
                { 1, 2, 4 },
                { 2, 3, 7 },
                { 2, 4, 8 },
                { 4, 3, 6 }
        };

        int src = 3;

        int[] ans = dijkstra(V, edges, src);

        System.out.println("Shortest distances:");

        for (int i = 0; i < V; i++) {
            System.out.println(
                    src + " -> " + i + " = " + ans[i]);
        }
    }
}