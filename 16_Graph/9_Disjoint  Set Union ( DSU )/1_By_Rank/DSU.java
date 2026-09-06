public class DSU {

    static int[] parent;
    static int[] rank;

    // Find + Path Compression
    static int find(int x) {

        if (parent[x] == x) {
            return x;
        }

        // Path Compression
        parent[x] = find(parent[x]);

        return parent[x];
    }

    // Union + Rank
    static void union(int x, int y) {

        int rootX = find(x);
        int rootY = find(y);

        // Already same set
        if (rootX == rootY) {
            return;
        }

        // Smaller rank -> bigger rank
        if (rank[rootX] < rank[rootY]) {

            parent[rootX] = rootY;

        } else if (rank[rootX] > rank[rootY]) {

            parent[rootY] = rootX;

        } else {

            // Same rank
            parent[rootY] = rootX;

            rank[rootX]++;
        }
    }

    static void printParent(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(
                i + " -> parent: " + parent[i]
                + ", rank: " + rank[i]
            );
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = 5;

        parent = new int[n];
        rank = new int[n];

        // Initially
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        System.out.println("Initially:");
        printParent(n);

        // {0,1}
        union(0, 1);

        // {2,3}
        union(2, 3);

        // {0,1,2,3}
        union(0, 2);

        System.out.println("After Union:");

        printParent(n);

        System.out.println("Find(3): " + find(3));
    }
}