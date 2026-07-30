
public class FP {
    private static int maze(int sr, int sc, int er, int ec){
       if(sr > er || sc > ec) return 0;
       if(sr == er || sc == ec ) return 1;
        int downway = maze(sr+1, sc, er, ec);
        int rightway = maze(sc, sc+1, er, ec);
        int  totalway = downway +rightway;
        return totalway;

    }
   public static void main(String[] args) {
    int row = 2;
    int col = 2;

    int count = maze(1, 1, row, col);
    System.out.println(count);
   } 
}
