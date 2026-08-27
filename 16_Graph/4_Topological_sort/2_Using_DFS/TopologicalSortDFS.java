import java.util.*;

public class TopologicalSortDFS {

    static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stack) {

        visited[node] = true;

        // Visit all neighbours
        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited, stack);
            }
        }

        // Add node after all neighbours are processed
        stack.push(node);
    }

    static ArrayList<Integer> topologicalSort(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        // Run DFS for every vertex
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, stack);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Directed edges
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> result = topologicalSort(V, adj);

        System.out.println("Topological Sort: " + result);
    }
}