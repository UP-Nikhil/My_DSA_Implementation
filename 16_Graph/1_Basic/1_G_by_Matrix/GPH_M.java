import java.util.Arrays;

public class GPH_M {
    public static void main(String[] args) {
       int[][] graph = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0}
        };

        int vertices = graph.length;

        for(int g[] : graph){
           System.out.println(Arrays.toString(g));
        }
    }
}
