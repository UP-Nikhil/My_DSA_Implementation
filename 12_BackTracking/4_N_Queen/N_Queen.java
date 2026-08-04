public class N_Queen {

    public static void Queen(char bord[][], int row) {

        int n = bord.length;

        if (row == n) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(bord[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int j = 0; j < n; j++) {

            if (isSafe(bord, row, j)) {

                bord[row][j] = 'Q';

                Queen(bord, row + 1);

                bord[row][j] = '.';   // Backtracking
            }
        }
    }

    private static boolean isSafe(char bord[][], int row, int col) {

        int n = bord.length;

        // Check Row
        for (int j = 0; j < n; j++) {
            if (bord[row][j] == 'Q')
                return false;
        }

        // Check Column
        for (int i = 0; i < n; i++) {
            if (bord[i][col] == 'Q')
                return false;
        }

        int i = row;
        int j = col;

        // NE
        while (i >= 0 && j < n) {
            if (bord[i][j] == 'Q')
                return false;
            i--;
            j++;
        }

        // SE
        i = row;
        j = col;
        while (i < n && j < n) {
            if (bord[i][j] == 'Q')
                return false;
            i++;
            j++;
        }

        // SW
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (bord[i][j] == 'Q')
                return false;
            i++;
            j--;
        }

        // NW
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (bord[i][j] == 'Q')
                return false;
            i--;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 4;

        char bord[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bord[i][j] = '.';
            }
        }

        Queen(bord, 0);
    }
}