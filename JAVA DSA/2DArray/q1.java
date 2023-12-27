
/*Write a Java program to print an array after changing the rows and columns of a two-dimensional array. */
import java.util.*;

public class q1 {

    static void func(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
       
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                arr2[i][j] = arr[j][i];

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; i < m; i++) {
                System.out.println(arr2[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        func(arr);

    }
}
