import java.util.Arrays;
import java.util.Scanner;

public class Min_max_arr_range {

    static int Arr_min(int arr[], int start, int end) {
        int min = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int Arr_max(int arr[], int start, int end) {
        int max = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array size: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter your array elements:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(num));

        System.out.println("Enter the range (start and end index): ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        // validation (important!)
        if (start < 0 || end >= num.length || start > end) {
            System.out.println("Invalid range!");
        } else {
            System.out.println("Maximum number between " + start + " to " + end + " : " + Arr_max(num, start, end));
            System.out.println("Minimum number between " + start + " to " + end + " : " + Arr_min(num, start, end));
        }

        sc.close();
    }
}