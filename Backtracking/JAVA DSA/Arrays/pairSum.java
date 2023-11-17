
/*Find the total number of pairs in the array whose sum is equal to the given value x */
import java.util.*;

public class pairSum {

    void pairsumcount(int n, int[] arr, int key) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
               
                if (arr[i] + arr[j] == key) {
                    count++;
                
            }
        }
    }
        System.out.println(count);

    }

    public static void main(String[] args) {
        pairSum obj = new pairSum();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        int key = sc.nextInt();

        obj.pairsumcount(n, arr, key);

    }
}
/*Find the total number of triplets in the array whose sum is equal to the given value x */
/* import java.util.*;

public class pairSum {

    void pairsumcount(int n, int[] arr, int key) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for(int k=j+1; k<n; k++){
                if (arr[i] + arr[j] + arr[k]== key) {
                    count++;
                }
            }
        }
    }
        System.out.println(count);

    }

    public static void main(String[] args) {
        pairSum obj = new pairSum();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        int key = sc.nextInt();

        obj.pairsumcount(n, arr, key);

    }
}
*/