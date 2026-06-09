// Write a funtion that returns all prime numbers between two given numbers.
import java.util.Scanner;
public class Range_prime {

    // fuctions 
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
        System.out.println("Enter range to find prime number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while (num1==num2) {
            prime(num1);
            num1++; 
            
        }
        

    }
}
