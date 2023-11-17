import java.util.Scanner;

public class q6_searching {

    public static boolean search(int n, int[] arr, int key) {
        boolean bool = false;
        if (n < 0) {
            return bool;
        }

        if (arr[n] == key) {
            return true;
        }

        search(n - 1, arr, key);

        return bool;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        System.out.println(search(n-1, arr, key));

    }
}
