import java.util.*;
 class RM_3 {

    ArrayList<String> ans = new ArrayList<>();

    public ArrayList<String> ratInMaze(int[][] maze) {

        int n = maze.length;

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return ans;

        solve(0, 0, maze, "", n);

        return ans;
    }

    private void solve(int r, int c, int[][] maze, String path, int n) {

        // Boundary Check
        if (r < 0 || c < 0 || r >= n || c >= n)
            return;

        // Blocked or Visited
        if (maze[r][c] == 0)
            return;

        // Destination
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        // Mark Visited
        maze[r][c] = 0;

        // D L R U (Lexicographical Order)
        solve(r + 1, c, maze, path + "D", n);
        solve(r, c - 1, maze, path + "L", n);
        solve(r, c + 1, maze, path + "R", n);
        solve(r - 1, c, maze, path + "U", n);

        // Backtracking
        maze[r][c] = 1;
    }
    public static void main(String[] args) {
        
    }
}