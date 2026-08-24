import java.util.*;

public class BFS_List {

    static void bfs(int start, ArrayList<ArrayList<Integer>> graph, int vertices) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        // Start from the given vertex
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            System.out.print(current + " ");

            // Visit all adjacent vertices
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create adjacency list
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(0);
        graph.get(2).add(5);

        graph.get(3).add(1);
        graph.get(4).add(1);
        graph.get(5).add(2);

        // BFS starting from vertex 0
        System.out.print("BFS Traversal: ");
        bfs(0, graph, vertices);
    }
}