
import java.util.Scanner;

public class PrimeNum{

    static void prime(int a){
    int count= 0;
    for (int i = 1; i <= a; i++) {
        if ( a%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("Prime number "+ a);
    }
    else{
        System.out.println("Not prime number"+a);
    }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        prime(num);

    }
}