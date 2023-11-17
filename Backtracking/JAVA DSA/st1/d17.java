import java.util.*;

public class d17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int i, j;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (j == 0) {

                    int temp = arr[i][j];
                    arr[i][j] = arr[i][c - 1];
                    arr[i][c - 1] = temp;

                }

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
