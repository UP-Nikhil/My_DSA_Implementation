import java.util.Scanner;

public class Convert_temprecher {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a, b;
        int choice;
        do {
            System.out.println("What you want to convert : ");
            System.out.println("1. Fahrenheit:");
            System.out.println("2. Degree Celcious :");
            System.out.println("3. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter in Degree tempreture: ");
                    a = sc.nextFloat();
                    b = (a * 9 / 5) + 32;
                    System.out.println(" Fahrenheit "+b);
                    break;

                case 2:
                    System.out.println("Enter in fahrenheit tempreture: ");
                    a = sc.nextFloat();
                    b = (a - 32) * 5 / 9;
                    System.out.println(" Celsius  "+b);
                    break;
                case 3:
                    System.out.println(" Exiting.....");
                    break;

                default:
                    System.out.println(" Invalid opration ");
            }

        } while (choice != 3);
        sc.close();
    }
}