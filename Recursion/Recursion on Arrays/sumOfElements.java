
//Find sum of array using recursion 
import java.util.*;

public class sumOfElements {
    static int sum(int[] arr, int idx) {
        // base case
        if (idx == arr.length)
            return 0;

        // recusrsive work
        int smallAns = sum(arr, idx + 1);
        // selfwork
        return smallAns + arr[idx];

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sum(arr, 0));

    }

}
