/*
 * Given an array nums of length n. We define a running sum of an array as runningSum[i]
= sum(nums[0]…nums[i]).
Return the running sum of nums.
Input Format
First line contains an integer n representing number of elements. Next line contains n integers
denoting array elements.
Constraints 1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
Output Format
An integer representing running sum array of the given array
Sample Input
4
1 2 3 4
Sample Output
1 3 6 10

 */

import java.util.Scanner;

public class f16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
int sum =0;
        for(int i=0 ; i<n; i++){
            sum += arr[i];
            System.out.print(sum + " ");
        }
    }
}
