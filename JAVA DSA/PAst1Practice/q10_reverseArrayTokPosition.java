// //10. Reverse the elements of an array to k positions

import java.util.Scanner;

public class q10_reverseArrayTokPosition {

    public static void reverseByk(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = k-1;
       
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        reverseByk(arr, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// import java.util.Scanner;

// public class q10_reverseArrayTokPosition {

//     public static void reverseByk(int[] arr, int k) {
//         int start = 0;
//         int end = k - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n]; // Fix 1: Initialize array with size 'n'
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int k = sc.nextInt();

//         reverseByk(arr, k);

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
