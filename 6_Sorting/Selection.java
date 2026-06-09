import java.util.Arrays;

public class Selection {
    static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];  
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {21, 4, 9, 13, 54, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}