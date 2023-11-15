import java.util.*;

public class SelectionSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr, int n) {

        for (int i = n - 1; i >= 0; i--) {
            int max = i;

            for (int j = n - 1; j >= 0; j--) {

                if (arr[max] >= arr[j]) {
                    max = j;
                }

                swap(arr, i, max);
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
