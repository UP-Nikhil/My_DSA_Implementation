import java.util.*;

public class Char_search {

    // function

    static boolean sear_ch(String name, char target) {
        if( name.length()==0){
            return false;
        }
        for (int i = 0; i <= name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }

        }
        return false;
    }
    static int  sear_ch2(String name, char target) {
        if( name.length()==0){
            return -1;
        }
        for (int i = 0; i <= name.length(); i++) {
            if (target == name.charAt(i)) {
                return name.charAt(i);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any String : ");
        String name = sc.nextLine();
        System.out.println(" Enter the charecter you want to search : ");
        char ch = sc.next().charAt(0);
        System.out.println(sear_ch(name, ch));
        if(sear_ch2(name, ch)==0){
            System.out.println(" Enter the string ");
        }
        System.out.println(" Your charecter in index : "+sear_ch2(name, ch));

    }
}
