public class Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
       // Base condition ;
        if (n == 0) {
            return 1;
        }
        // self work;


        // recusive work;
        return n * factorial(n - 1);
    }
}
