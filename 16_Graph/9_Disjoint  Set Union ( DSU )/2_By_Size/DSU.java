public class DSU {

    static int[] parent;
    static int[] size;

    // Find + Path Compression
    static int find(int x) {

        if (parent[x] == x) {
            return x;
        }

        // Path Compression
        parent[x] = find(parent[x]);

        return parent[x];
    }

    // Union + Size
    static void union(int x, int y) {

        int rootX = find(x);
        int rootY = find(y);

        // Already same set
        if (rootX == rootY) {
            return;
        }

        // Smaller component -> bigger component
        if (size[rootX] < size[rootY]) {

            parent[rootX] = rootY;

            size[rootY] += size[rootX];

        } else {

            parent[rootY] = rootX;

            size[rootX] += size[rootY];
        }
    }

    static void printParent(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(
                    i + " -> parent: " + parent[i]
                            + ", size: " + size[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = 5;

        parent = new int[n];
        size = new int[n];

        // Initially
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
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