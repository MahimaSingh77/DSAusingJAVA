
// 2 . Rotate the given array clockwise by k times
import java.util.*;

public class q2 {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }

    public static void rotate(int n, int[] arr, int k) {
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotate(n, arr, k);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}


// public class q2 {

//     public static void RotateK(int arr[], int n, int k) {
//         // Create a temporary array to store the rotated values
//         int[] temp = new int[n];
        
//         // Copy the elements to the temporary array with rotation
//         for (int i = 0; i < n; i++) {
//             temp[(i + k) % n] = arr[i];
//         }
        
//         // Copy the rotated elements back to the original array
//         for (int i = 0; i < n; i++) {
//             arr[i] = temp[i];
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 2, 7, 5, 1};
//         int k = 2;
//         int n = 5;
        
//         RotateK(arr, n, k);

//         // Print the rotated array
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }