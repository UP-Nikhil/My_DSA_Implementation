import java.util.Arrays;

public class Bellman_Ford {

    static final int INF = 100000000;

    public static int[] bellmanFord(int V, int[][] edges, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, INF);

        dist[src] = 0;

        // Relax all edges V-1 times
        for (int i = 1; i <= V - 1; i++) {

            for (int[] edge : edges) {

                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];

                if (dist[u] != INF && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }

        }

        // Check for negative weight cycle
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            if (dist[u] != INF && dist[u] + wt < dist[v]) {
                return new int[]{-1};
            }
        }

        return dist;
    }

    public static void main(String[] args) {

        int V = 4;

        int[][] edges = {
            {0, 1, 4},
            {0, 2, 5},
            {1, 2, -2},
            {2, 3, 3}
        };

        int src = 0;

        int[] result = bellmanFord(V, edges, src);

        System.out.println("Shortest distances from source " + src + ":");
        System.out.println(Arrays.toString(result));
    }
}