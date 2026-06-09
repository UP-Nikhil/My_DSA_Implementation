import java.util.*;

public class Rev_Array {

    static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;

        }

    }

    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

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
        // swap(num,0, num.length);
        reverse(num);
        System.out.println(" Your reverse array : " + Arrays.toString(num));

    }
}
