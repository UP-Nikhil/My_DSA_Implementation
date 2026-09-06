import java.util.*;

public class Kruskal {

    static int[] parent;
    static int[] size;

    static int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    static void union(int u, int v) {

        int rootU = find(u);
        int rootV = find(v);

        if (rootU == rootV) {
            return;
        }

        if (size[rootU] < size[rootV]) {
            parent[rootU] = rootV;
            size[rootV] += size[rootU];
        } else {
            parent[rootV] = rootU;
            size[rootU] += size[rootV];
        }
    }

    public static void main(String[] args) {

        int V = 4;

        // {u, v, weight}
        int[][] edges = {
            {0, 1, 1},
            {0, 2, 4},
            {0, 3, 2},
            {1, 3, 3},
            {2, 3, 5}
        };

        parent = new int[V];
        size = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        // Min Heap based on weight
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[2] - b[2]);

        // Saari edges PQ mein daalo
        for (int[] edge : edges) {
            pq.offer(edge);
        }

        int mstWeight = 0;
        int edgeCount = 0;

        System.out.println("Selected Edges:");

        while (!pq.isEmpty() && edgeCount < V - 1) {

            // Sabse minimum weight edge
            int[] edge = pq.poll();

            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            if (find(u) != find(v)) {

                union(u, v);

                mstWeight += weight;
                edgeCount++;

                System.out.println(u + " - " + v + " : " + weight);
            }
        }

        System.out.println("MST Weight = " + mstWeight);
    }
}