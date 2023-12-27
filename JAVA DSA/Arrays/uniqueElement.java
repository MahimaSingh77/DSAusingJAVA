/*Find the unique number in a given Array where all the elements are being repeated twice with one value being  unique */
import java.util.*;
public class uniqueElement {
    void unique(int n, int[] arr){

       for(int i=0; i<n ; i++){
        for(int j=i+1; j<n;j++){
           if(arr[i]==arr[j]) {
            arr[i] = -1;
            arr[j] = -1;
           }
          
        }
       }
       for(int i=0; i<n; i++){
        if(arr[i]>0){
            System.out.println(arr[i]);
        }
       }

    }


    public static void main(String[] args) {
        uniqueElement obj = new uniqueElement();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
       

        obj.unique(n, arr);

    }
}
