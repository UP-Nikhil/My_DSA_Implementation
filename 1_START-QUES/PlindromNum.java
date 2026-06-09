
// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PlindromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int num = sc.nextInt();
        int real=num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
if (rev == real) {  
            System.out.println(" Palindrome number");
        } else { 
            System.out.println(" Not Palindrome ");
        }
    }
}
