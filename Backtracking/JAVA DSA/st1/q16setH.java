/*
 * . Given an array A of size N-1 such that it only contains distinct integers in the range of 1
to N. Find the missing element.
Input Format
The first and only line contains an integer N denoting the size of the array. The second line
contains array elements A.
Output format
Find the missing element and print it.
Constraints
1 ≤ N ≤ 10^6
1 ≤ A[i] ≤ 10^6
Time Limit
1 second
Example
Sample Input
5
1 2 3 5
Sample Output
4
Sample test case expl
 */
import java.util.*;
public class q16setH {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n-1];
    int sum = n*(n+1)/2;
    int sum0=0;
    for(int i=0 ; i<n-1; i++){
        arr[i] = sc.nextInt();
        sum0 += arr[i];

    }
    System.out.println(sum - sum0);


   } 
}
