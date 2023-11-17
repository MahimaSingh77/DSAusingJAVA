
/*Rotate the given array 'a' by k steps, where k is non-negative.
 note : k can be greeater than n as well
 */
/* 
import java.util.*;

public class rotate {

    static void rotateArray(int n, int k, int[] arr) {
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
           
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }

    }

    public static void main(String[] args) {
        rotate obj = new rotate();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        int k = sc.nextInt();

        obj.rotateArray(n, k, arr);
    }
}
*/







/*Rotate the given array 'a' by k steps, where k is non-negative.Without using extra spaces.
 note : k can be greeater than n as well
 */
 
import java.util.*;

public class Rrotate {
    static void reverseArray(int[] arr, int i , int j){
       
             
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
           
        }
    }
    static void rotateArray(int[] arr , int k){
         
        int n= arr.length;
        k=k%n;
        reverseArray(arr, 0 , n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
      
for(int i=0; i<n; i++){
    System.out.println(arr[i]);
}

    }
    public static void main(String[] args) {
       


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        

        int k = sc.nextInt();
        rotateArray(arr , k);

        
    }
}