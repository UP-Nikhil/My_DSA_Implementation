import java.util.Arrays;

public class Insertion {
    static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // shift elements
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;            
            }

            // insert element    v 
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 9, 13, 54, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}