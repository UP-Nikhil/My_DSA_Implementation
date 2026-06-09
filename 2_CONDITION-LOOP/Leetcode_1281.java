
/*  Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//  

// Example 1:

// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15    */

import java.util.Scanner;

public class Leetcode_1281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int num = sc.nextInt();
        int rev = 0, sum = 0, product = 1, result = 0;
        while (num > 0) {
            rev = num % 10;
            product = product * rev;
            sum = sum + rev;
            num = num / 10;
        }
        result = product - sum;
        System.out.println(result);
    }

}
