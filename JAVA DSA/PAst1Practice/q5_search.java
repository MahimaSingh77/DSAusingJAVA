
// 5. Search an element in the 2D array

import java.util.Scanner;

public class q5_search {
    public static boolean search(int m, int n, int[][] arr, int key) {
        boolean bool = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (key == arr[i][j]) {
                    bool = true;
                }
            }
        }

        return bool;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }
        int key = sc.nextInt();

        System.out.println(search(m, n, arr, key));
    }
}
