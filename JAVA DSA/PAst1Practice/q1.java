import java.util.*;

//Check whether the given arrar is sorted or not
// public class q1 {

//     public static boolean checkSorting(int n, int[] arr) {
//         boolean bool = true;
//         for (int i = 0; i < n; i++) {
//             if (arr[0] > arr[i])
//                 bool = false;
//         }
//         return bool;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[5];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println(checkSorting(n, arr));

//     }
// }


public class q1 {

    public static boolean CheckSortedArray(int arr[], int startIndex){

        if (startIndex >= arr.length -1) {
            return true;
            
        }
        if (arr[startIndex]> arr[startIndex + 1]) {
            return false;
        }

         boolean smallAns = CheckSortedArray(arr, startIndex+1);
         return smallAns;
    } 

    public static void main(String[] args) {
        int arr[] = { 3,5,1,6};
        System.out.println(CheckSortedArray(arr, 0));
        
    }
}