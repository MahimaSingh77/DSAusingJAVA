
// Given an array of n integers and a target value x.
// Print whether x exists in the array or not.
import java.util.*;

public class LinearSearch {

    static int search(int[] arr, int idx, int key) {

        if (idx >= arr.length) {
            return -1;
        }
        if (arr[idx] == key)
            return idx;

        return search(arr, idx + 1, key);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(search(arr, 0, key));
    }
}