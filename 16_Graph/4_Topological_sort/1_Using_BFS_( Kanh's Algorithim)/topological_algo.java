import java.util.*;

public class topological_algo {

    public static ArrayList<Integer> topologicalSort(int V, int[][] edges) {

        // convert in list;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
        }
        
        // define inDegree array;
        int[] inDegree = new int[V];
         
        // fill the degree; ;
        for (int u = 0; u < V; u++) {
            for (int num : adj.get(u)) {
                inDegree[num]++;
            }
        }
      
        Queue<Integer> q = new LinkedList<>();

         // fill the degree, jis node k degree 0 hia usko fill kar do arr me ;
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }
 
         // store the result;
        ArrayList<Integer> ans = new ArrayList<>();
        
       // Kahn’s Algorithm (BFS)
        while (!q.isEmpty()) {

            int top = q.poll();

            ans.add(top);

            for (int next : adj.get(top)) {

                inDegree[next]--;

                if (inDegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int V = 6;

        int[][] edges = {
                { 5, 2 },
                { 5, 0 },
                { 4, 0 },
                { 4, 1 },
                { 2, 3 },
                { 3, 1 }
        };

        ArrayList<Integer> result = topologicalSort(V, edges);

        System.out.println(result);
    }
}