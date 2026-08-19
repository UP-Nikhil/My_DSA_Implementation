
// knapstack using recusrion;
public class KR {

    // Knapstack algo
    public static int knapstack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0)
            return 0;
        if (wt[n - 1] <= W) {
            int include = val[n - 1] + knapstack(val, wt, W - wt[n - 1], n - 1);
            int exclude = knapstack(val, wt, W, n - 1);
            return Math.max(include, exclude);
        } else {
            return knapstack(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = { 20, 30, 50, 60, 100 };
        int wt[] = { 2, 3, 4, 5, 9 };
        int W = 10;
        int n = val.length;

        System.out.println(knapstack(val, wt, W, n));
    }
}