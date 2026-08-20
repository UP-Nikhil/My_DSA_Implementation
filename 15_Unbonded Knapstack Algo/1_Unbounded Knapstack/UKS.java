
import java.util.*;;

public class UKS {

    public static int UB_knapstac_Memo(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0)
            return 0;

        if (dp[n][W] != -1)
            return dp[n][W];
        if (wt[n - 1] <= W) {

            // In unbounded knapstack when we teke (inckude) the val , then don't go (n-1)

            int skip = UB_knapstac_Memo(val, wt, W, n - 1, dp);
            int take = val[n - 1] + UB_knapstac_Memo(val, wt, W - wt[n - 1], n, dp);
            return dp[n][W] = Math.max(take, skip);
        } else {
            return dp[n][W] = UB_knapstac_Memo(val, wt, W, n - 1, dp);
        }
    }

    public static void main(String[] args) {
        int val[] = { 6, 3, 7, 25 };
        int wt[] = { 2, 2, 8, 9 };
        int W = 20;
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int arr[] : dp) {
            Arrays.fill(arr, -1);
        }

        System.out.println(UB_knapstac_Memo(val, wt, W, n, dp));
    }
}
