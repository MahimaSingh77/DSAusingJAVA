import java.util.*;

public class a18 {

    public static boolean canBreak(int n, int p1, int p2) {
        boolean bool = false;
        if (p1 % n == 0 & p2 % n == 0) {
            bool = true;
        }

        return bool;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p1 = sc.nextInt();
        int p2 = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (canBreak(arr[i], p1, p2)) {
                count++;
            }

        }

        System.out.println(count);

    }
}
