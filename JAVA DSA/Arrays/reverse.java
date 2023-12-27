/*Reverse an array consisting of integernvalues */
/*
import java.util.*;
public class reverse {

    static void reverseArray(int n , int[] arr){
        int[] arr2 = new int[n];
        int j=0;                      // *************imp**************
        for(int i=n-1; i>=0; i--){
           
           arr2[j++] = arr[i];
        }
    
        for(int i=0; i<n; i++){
            System.out.println(arr2[i]);
        }
    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
       

       reverseArray(n, arr);
    }
}



*/

/***********************Another Method without creating another array************************/
/* import java.util.*;
class reverse{
    static void reverseArray(int n , int[] arr){
       
        int i=0;
        int j =n-1;
        for(i=0;i<j; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            j--;
        }
        for( i=0; i<n; i++){
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
       reverseArray(n, arr);
    }
}

*/