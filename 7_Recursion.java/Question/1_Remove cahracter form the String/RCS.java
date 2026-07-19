public class RCS {
    static String rcs(String s , int i , char a){
        String ans = "";
        if(i == s.length()){
            return ans;
        }
        if(s.charAt(i) != a){
             ans += s.charAt(i);
        }
        return  ans + rcs(s, i+1, a);
    }
    public static void main(String[] args) {
        String  s= "b";
       System.out.println(rcs(s, 0, 'a'));
    }
}
