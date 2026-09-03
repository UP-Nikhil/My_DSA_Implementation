

public class FloydWarshall {

    static final int INF = 100000000;

    public static void floydWarshall(int[][] dist) {

        int n = dist.length;

        // Floyd-Warshall Algorithm
        for (int via = 0; via < n; via++) {

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    // Agar dono paths exist karte hain
                    if (dist[i][via] != INF && dist[via][j] != INF) {

                        dist[i][j] = Math.min( dist[i][j],  dist[i][via] + dist[via][j]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] dist = {
                { 0, 5, INF, 10 },
                { INF, 0, 3, INF },
                { INF, INF, 0, 1 },
                { 2, INF, INF, 0 }
        };

        System.out.println("Before Floyd-Warshall:");

        printMatrix(dist);

        floydWarshall(dist);

        System.out.println("\nAfter Floyd-Warshall:");

        printMatrix(dist);
    }

     // Print Matrix; 

    public static void printMatrix(int[][] dist) {

        for (int i = 0; i < dist.length; i++) {

            for (int j = 0; j < dist.length; j++) {

                if (dist[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + "   ");
                }
            }

            System.out.println();
        }
    }
}