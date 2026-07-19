public class Recursion {

    // basic recursive function
    static int P_num(int num){
        if(num == 0){
            return 1;
        }
        System.out.println(num);
        return  P_num(num -1 );
    }
    public static void main(String[] args) {
       // Base condition 
       // self work 
       // recursive work;
        P_num(5);
    }
}
