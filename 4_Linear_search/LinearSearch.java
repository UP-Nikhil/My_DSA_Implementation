
import java.util.*;

public class LinearSearch {

    static int L_search(int arr[], int num) {
        int item = num;
        for( int i= 0; i< arr.length; i++){
            if( item==arr[i]){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter your array elements:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Your entered array: " + Arrays.toString(num)); 
         System.out.print("Enter your item you want to search :  ");
        int item = sc.nextInt();
        int ans= L_search(num, item);
        if ( ans==-1){
            System.out.println(" Item not found in arry : ");
        }
        else{
            System.out.println(" Your iten found  in index "+ans);
        }
        

    }
}
