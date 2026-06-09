//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class E_3_Numsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, sum=0;
        System.out.println(" Enter the number :");
        num=sc.nextInt();
        while (num>0) {
            sum=sum+num;
            num--;
        }
        System.out.println( "Result "+sum);
    }
} 