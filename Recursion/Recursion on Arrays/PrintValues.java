import java.util.Scanner;
// Given an array , print all its values recursively 
public class PrintValues {
    static void print(int[] arr , int idx){
        
        if(idx>=arr.length) return;
        System.out.print(arr[idx] + " ");
        print(arr, ++idx);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        print(arr , 0);

    }
}
