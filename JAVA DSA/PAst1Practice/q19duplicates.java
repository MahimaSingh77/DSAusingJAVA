// 19. Find duplicates: Given an array of integers where each element is between 
// 1 and n(inclusive) , find all the duplicates in the array.

// import java.util.Scanner;

// public class q19duplicates {

//     public static void duplicates(int[] arr, int n) {

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] == arr[j]) {

//                     System.out.print(arr[j] + " ");
//                     break;

//                 }
//             }

//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[5];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         duplicates(arr, n);

//     }

// }


import java.util.Scanner;

public class q19duplicates {

    public static void duplicates(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {

                    System.out.print(arr[i] + " ");
                    break;

                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        duplicates(arr, n);

    }

}
