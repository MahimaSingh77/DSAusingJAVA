
import java.util.*;
public class q1{

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        
        int pivot = arr[high];
 
      
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            
            if (arr[j] < pivot) {
 
          A
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    
   
        static void sort(int[] arr, int low, int high)
        {
            if (low < high) {
     
                // pi is partitioning index, arr[p]
                // is now at right place
                int pi = partition(arr, low, high);
     
                // Separately sort elements before
                // partition and after partition
                sort(arr, low, pi - 1);
                sort(arr, pi + 1, high);
            }
        }
        // To print sorted array
        public static void printArr(int[] arr)
        {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }


    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){

        arr[i] = sc.nextInt();

    }

    sort(arr , 0 , n-1);
    for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
    }
    
    
}
}