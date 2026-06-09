
// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1,c;
        System.out.print(" What you want to number of fibonachi serious ...");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println(a);
            c=a+b;
            a = b;
            b = c;

        }
      sc.close();
    }
}
