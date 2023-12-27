/*
 * e: If at any instance, there are no more subarrays of size greater than or equal to K, then
reverse the last subarray (irrespective of its size). You should not return any array and modify
the given array in place.
Input Format
The first line contains an integer N denoting the size of the array A and integer K denoting the
size of subarray. The next line contains n elements of the array.
Output format
Reverse every subarray group of size K and print the array.
Constraints
1 ≤ N, K ≤ 10^4
1 ≤ A[i] ≤ 10^4
Example
Sample Input
5 3
1 2 3 4 5
Sample Output
3 2 1 5 4

 */
import java.util.*;
public class E18 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int key = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0 ; i<n; i++){
        arr[i] = sc.nextInt();
    }

    for(int i=key-1; i>=0; i--){
        System.out.print(arr[i] + " ");
    }
    for(int i=n-1; i>=key; i--){
        System.out.print(arr[i] + " ");
    }
    

   } 
}
