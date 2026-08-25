public class DFSMatrix {

    static void dfs(int current, int[][] graph, boolean[] visited) {

        // Mark current vertex as visited
        visited[current] = true;

        // Print current vertex
        System.out.print(current + " ");

        // Check all adjacent vertices
        for (int i = 0; i < graph.length; i++) {

            if (graph[current][i] == 1 && !visited[i]) {
                dfs(i, graph, visited);
            }
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0}
        };

        boolean[] visited = new boolean[graph.length];

        System.out.print("DFS Traversal: ");
        dfs(0, graph, visited);
    }
}