
import com.sun.source.tree.Tree;
import java.util.Scanner;

public class Check_alfbet_S_C {
    public static void main(String[] args) {
        boolean tr = true;
        Scanner sc = new Scanner(System.in);
        while (tr) {
            System.out.println("Enter any charecter...");
            char alf = sc.next().trim().charAt(0);
            if (alf >= 'a' && alf <= 'z') {
                System.out.println(" Small ...");
            } else {
                System.out.println(" Capital");
                tr = false;

            }

        }
        sc.close();
    }
}
