
// Find area and parameter 
import java.util.Scanner;

public class E_1_Area {

    // Rectangle
    static double R_area(double a, double b) {
        return a * b;

    }

    static double R_parameter(double a, double b) {
        return 2 * (a + b);

        // -------Circle
    }

    static double Cr_area(double a) {
        return (Math.PI) * a * a;
    }

    static double Cr_parameter(double a) {
        return 2 * (Math.PI) * a;
    }

    // ---------Triangle
    // -------Equvalent triangle
    static double Eq_area(double a, double b) {
        return ((1.732) / 4) * a * b;
    }

    static double Eq_parameter(double a) {
        return 3 * a;
    }

    // -----Scalene Triangle
    static double Sc_area(double a, double b) {
        return (a * b) / 2;
    }

    static double Sc_parameter(double a, double b, double c) {
        return a + b + c;
    }

    // --------Ractangle triangle
    static double Ra_area(double a, double b) {
        return (a * b) / 2;
    }

    static double Ra_parameter(double a, double b, double c) {
        return a + b + c;
    }

    // Rymbos
    static double Ry_area(double a, double b) {
        return a * b;

    }

    static double Ry_parameter(double a) {
        return 2 * a;
    }

    // Cylinder
    static double Cy_area(double a, double b) {
        return 2 * (Math.PI) * a * b;
    }

    static double Cy_sarea(double a, double b) {
        return 2 * (Math.PI) * a * (a + b);
    }

    static double Cy_volume(double a, double b) {
        return (Math.PI) * a * a * b;
    }

    static double Cy_parameter(double a) {
        return 2 * (Math.PI) * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("You can  chooose the faloowing option to find area and parameter : ");
            System.out.println("1. Rectangle: ");
            System.out.println("2. Circle : ");
            System.out.println("3. Triangle : ");
            System.out.println("4. Rymbos : ");
            System.out.println("5. Cylinder : ");
            System.out.println("6. Exit : ");
            System.out.print(" Enter here...");
            choice = sc.nextInt();
            double x, y, z;
            switch (choice) {
                case 1:
                    System.out.println(" Enter the ractangle height and width :  ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Area " + R_area(x, y));
                    System.out.println("Paramater " + R_parameter(x, y));
                    break;

                case 2:
                    System.out.println(" Enter the circle radius :  ");
                    x = sc.nextInt();
                    System.out.println("Area " + Cr_area(x));
                    System.out.println("Paramater " + Cr_parameter(x));
                    break;
                case 3:
                    System.out.println("Enter the height and base of triangle : ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("  Choose the triangle : ");
                    System.out.println("1.Equilatral triangle : ");
                    System.out.println("2. Scalence triangle : ");
                    System.out.println("3.Right-Angle triangle : ");

                    int tr = sc.nextInt();
                    switch (tr) {
                        case 1:
                            System.out.println("Area " + Eq_area(x, y));
                            System.out.println("Parameter " + Eq_parameter(x));

                            break;
                        case 2:
                            System.out.println(" Enter the third lenght : ");
                            z = sc.nextInt();
                            System.out.println("Area " + Sc_area(x, y));
                            System.out.println("Parameter " + Sc_parameter(x, y, z));
                            break;
                        case 3:
                            z = Math.sqrt((x * x) + (y * y));
                            System.out.println("Area " + Ra_area(x, y));
                            System.out.println("Parameter " + Ra_parameter(x, y, z));
                            break;
                        default:
                            System.out.println("Invalid choice ");
                    }

                    break;
                case 4:
                    System.out.println(" Enter the diagonals lenght :  ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Area " + Ry_area(x, y));
                    System.out.println(" Enter the rymbos lenght: ");
                    z = sc.nextInt();
                    System.out.println("Paramater " + Ry_parameter(z));
                    break;
                case 5:
                    System.out.println(" Enter the cylinder  radius :  ");
                    x = sc.nextInt();
                    System.out.println(" Enter the cylinder  height :  ");
                    y = sc.nextInt();
                    System.out.println("Area " + Cy_area(x, y));
                    System.out.println("Surface area " + Cy_sarea(x, y));
                    System.out.println("Volume " + Cy_volume(x, y));
                    System.out.println("Paramater " + Cy_parameter(x));
                    break;
                case 6:
                    System.out.println(" Exiting.....");
                    break;

                default:
                    System.out.println(" Invalid opration ");
            }

        } while (choice != 6);
        sc.close();
    }
}