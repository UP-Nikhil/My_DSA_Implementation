import java.util.Scanner;

public class Check_repeat_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int num= sc.nextInt();
        System.out.println(" what you want to check repeat number : ");
        int n= sc.nextInt();
        int count=0;
        while (num>0) { 
            int rep= num%10;
            if(rep==n){
                count++;
            }
           num=num/10;

        }
        System.out.println( n+"  Repeat "+ count+ " times in your enter number .. ");
    }
}
