

import java.util.*;

public class printPair {

    static void printPair(int n, int[] arr){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.println( "(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        printPair(n , arr);
    }

}
