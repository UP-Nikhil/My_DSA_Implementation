import java.util.Arrays;

public class Quicksort {
    

    // second approach;
    static void sort(int arr[], int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, hi);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 7, 2, 9, 8, 3, 5 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
