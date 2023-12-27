
/*
 * : Given an array A of N integers. Check whether it contains a triplet that sums up to zero.
Input Format
The first line contains an integer N denoting the size of the array. The second line contains
elements of the array A.
Output format
Print 1 if it contains a triplet that sums up to zero else print 0.
Constraints
1 <= N <= 10^4
-10^6 <= A[i] <= 10^6

 */
import java.util.*;

public class q18setH {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean bool = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        bool = true;
                        break;
                    }
                }
            }
        }
       System.out.println(bool);
    }
}