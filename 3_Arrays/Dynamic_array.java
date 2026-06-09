// Dynamic array in this type  
/* {  { 23 ,4, 54, 54}
        { 54, 6, 7}
        { 3, 13}
        { 5, 53,46, 87,90}
    } 
        
    through user input 
    */

import java.util.*;

public class Dynamic_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter th size of row : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" Enter the size of row " + i + " : ");
            int m = sc.nextInt();
            arr[i] = new int[m];

            System.out.print(" Enter the element : ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println(" Your arrays : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }
}
