import java.util.Scanner;

public class q25_lastOccurence {

    public static int last_occurrence(int n, int[] arr, int target) {

        int ind = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                ind = i;

            }

        }
        return ind;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(last_occurrence(n, arr, target));

    }
}
