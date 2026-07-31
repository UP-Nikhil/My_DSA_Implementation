public class Print_4_direction_path {

    private static void maze(int sr, int sc, int er, int ec,
                             String s, boolean[][] isVisited) {

        if (sr < 0 || sc < 0 || sr > er || sc > ec)
            return;

        if (isVisited[sr][sc])
            return;

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        isVisited[sr][sc] = true;

        // Right
        maze(sr, sc + 1, er, ec, s + "R", isVisited);

        // Down
        maze(sr + 1, sc, er, ec, s + "D", isVisited);

        // Left
        maze(sr, sc - 1, er, ec, s + "L", isVisited);

        // Up
        maze(sr - 1, sc, er, ec, s + "U", isVisited);

        // Backtracking
        isVisited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        boolean[][] isVisited = new boolean[row][col];

        maze(0, 0, row - 1, col - 1, "", isVisited);
    }
}