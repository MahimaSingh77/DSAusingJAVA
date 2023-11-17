import java.util.*;

public class q20sorting {
    public static void sort(int[] arr, int n) {

        Arrays.sort(arr);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, n);

         for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
