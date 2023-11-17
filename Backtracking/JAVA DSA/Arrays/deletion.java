/***7****************Write a Java program to remove a specific element from an array***************/
import java.util.*;
public class deletion {

    void remove(int n, int key ,int[] arr1){
        int[] arr2 = new int[n-1];
            for(int i=0; i<n; i++){
                    for(int j=0; j<n-1; j++){
                        if(arr1[i]==key){
                            continue;
                        }
                        else{
                            arr2[j] = arr1[i];
                        }
                    }
            }
            for(int j=0; j<n-1;j++){
                System.out.println(arr2[j]);
            }

    }
        public static void main(String[] args) {
        deletion obj = new deletion();

        Scanner sc = new Scanner(System.in); 
        
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
         obj.remove(n, key , arr1);

    }
}
