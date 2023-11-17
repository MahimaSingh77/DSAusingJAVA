
import java.util.Scanner;

public class q29_all_Occurrence {
    public static void all_occurrence(int n, int[] arr, int target) {

        int ind = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {

                System.out.print(i + " ");

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
        int target = sc.nextInt();

        all_occurrence(n, arr, target);

    }
}
