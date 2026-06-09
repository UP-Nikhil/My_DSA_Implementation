
import java.util.Arrays;
import java.util.Scanner;

public class Min_max_arr {

    // Maximiu number function;
    static int Arr_max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]>max) {
                max = arr[i];
            } 
        }
        return max;
    }
    static int Arr_min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]<min) {
                min = arr[i];
            } 
        }
        return min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   
        System.out.print(" Enter your array size : ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println(" Enter your array element : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        System.out.println(" Maximum number your input array :" + Arr_max(num));
        System.out.println(" Minimum number your input array :" + Arr_min(num));

    }
}
