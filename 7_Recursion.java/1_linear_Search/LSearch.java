
public class LSearch {

    // function 
    static int Search(int arr[], int target , int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx]== target){
            return idx+1;
        }
        return Search(arr,target,idx+1);
    }
    public static void main(String args[]){
        int arr[] = { 1,2,4,5,8,12,13};
        System.out.println(Search(arr,8,0));             
    }
}
