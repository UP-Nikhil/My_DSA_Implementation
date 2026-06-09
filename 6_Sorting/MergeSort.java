import java.util.Arrays;

public class MergeSort {
  // mearge sort function
  static int[] Meargesort(int arr[]) {
    if (arr.length <=1) {
      return arr;
    }
    int mid = arr.length / 2;
    int[] left = Meargesort(Arrays.copyOfRange(arr, 0, mid));
    int[] Right = Meargesort(Arrays.copyOfRange(arr, mid, arr.length));
    return mearge(left, Right);
  }

  private static int[] mearge(int[] first, int[] second) {
    int mix[] = new int[first.length + second.length];
    int i = 0, j = 0, k = 0;
    // left
    while (i < first.length && j < second.length) {
      if (first[i] < second[j]) {
        mix[k] = first[i];
        i++;
      } else {  
        mix[k] = second[j];
        j++;
      }
      k++;
    }
    // if left array element are remaining ;
    while (i < first.length) {
      mix[k] = first[i];
      i++;
      k++;
    }
        // if right array element are remaining ;
      while (j < second.length) {
      mix[k] = second[j];
      j++;
      k++;
    }   
    return mix;
  }

  public static void main(String[] args) {
    int arr[]={6,4,7,2,9,8,3,5};
    arr=Meargesort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
