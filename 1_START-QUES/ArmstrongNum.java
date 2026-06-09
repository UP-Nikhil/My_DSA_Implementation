// To find Armstrong Numbers between two given numbers

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to find Armstrong numbers:");
        System.out.print("Enter first number: ");
        int num = sc.nextInt();

        System.out.print("Enter second number: ");
        int last = sc.nextInt();

        for (int i = num; i <= last; i++) {
            int temp = i;   
            int sum = 0;    

            while (temp > 0) {
                int digit = temp % 10;   
                sum = sum + (digit * digit * digit);
                temp = temp / 10;       
            }

            if (i == sum) {
                System.out.println(sum);
            }
        }

        sc.close();
    }
}