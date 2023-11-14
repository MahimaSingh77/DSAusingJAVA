// Print the max value of the array   time complexity O(n)  space complexity O(n)

import java.util.*;

public class maxElement {
    static int max(int[] arr, int idx) {
        // base Case
        if (idx == arr.length - 1)
            return arr[idx];

        // small Problem -> idx+1 , end of array ->max return
        int smallAns = max(arr, idx + 1);

        // SelfWork and final answer
        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(max(arr, 0));

    }

}
