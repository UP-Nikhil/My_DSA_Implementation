import java.util.Arrays;

public class Bubble {
    static void Bubble(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            boolean swap= false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                 arr[j-1]=temp;
                    swap=true;
                }
                
            } 
            if(!swap){
                    break;
                } 
        }

    }

    public static void main(String[] args) {
        int arr[] = { 21, 4, 9, 13, 54, 2, 1 };
         Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
