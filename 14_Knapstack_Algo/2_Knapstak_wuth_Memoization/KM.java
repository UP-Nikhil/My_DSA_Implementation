import java.util.Arrays;

public class KM {
    public static int knapstack_Memoization(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0)
            return 0;

        if (dp[n][W] != -1)
            return dp[n][W];
        if (wt[n - 1] <= W) {
            int include = val[n - 1] + knapstack_Memoization(val, wt, W - wt[n - 1], n - 1, dp);
            int exclude = knapstack_Memoization(val, wt, W, n - 1, dp);
            return dp[n][W] = Math.max(include, exclude);
        } else {
            return dp[n][W] = knapstack_Memoization(val, wt, W, n - 1, dp);
        }
    }

    public static void main(String[] args) {
        int val[] = { 20, 30, 50, 60, 100 };
        int wt[] = { 2, 3, 4, 5, 9 };
        int W = 10;
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int arr[] : dp) {
            Arrays.fill(arr, -1);
        }

        System.out.println(knapstack_Memoization(val, wt, W, n, dp));
    }
}
