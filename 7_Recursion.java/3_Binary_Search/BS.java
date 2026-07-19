public class BS {
    // function
    static int B_S(int arr[], int target, int s, int l) {
        if (s > l) {
            return -1;
        }
        int mid = s + (l - s) / 2;
        if (arr[mid] == target) {
            return mid + 1;
        }
        if (arr[mid] < target) {
            s = mid + 1;
        } else {
            l = mid - 1;
        }
        return B_S(arr, target, s, l);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 8, 12, 13 };
        System.out.println(B_S(arr, 8, 0, arr.length));
    }
}