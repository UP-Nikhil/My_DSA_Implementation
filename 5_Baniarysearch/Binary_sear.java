import java.util.*;

public class Binary_sear {

    static int binary_ser(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean dec = arr[0] > arr[arr.length - 1];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (!dec) { // ascending
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // descending
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter -1 to stop input:");
        System.out.println("Enter the array elements:");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            list.add(num);
        }

        // // sort (important for binary search)
        // Collections.sort(list);

        System.out.println("Your entered array elements: " + list);

        System.out.println("Enter element to search:");
        int target = sc.nextInt();

        int arr[] = list.stream().mapToInt(i -> i).toArray();

        int result = binary_ser(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
