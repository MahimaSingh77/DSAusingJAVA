import java.util.Scanner;

public class q7targetsum {

    public static void target_sum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (target == arr[i] + arr[j]) {
                    System.out.println(i + " " + j);
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

        int target = sc.nextInt();

        target_sum(arr, target);

    }
}
