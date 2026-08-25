import java.util.*;

public class DFSList {

    static void dfs(int current, ArrayList<ArrayList<Integer>> graph,
                    boolean[] visited) {

        // Mark current vertex as visited
        visited[current] = true;

        // Print current vertex
        System.out.print(current + " ");

        // Visit all adjacent vertices
        for (int neighbor : graph.get(current)) {

            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

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

        boolean[] visited = new boolean[vertices];

        System.out.print("DFS Traversal: ");
        dfs(0, graph, visited);
    }
}