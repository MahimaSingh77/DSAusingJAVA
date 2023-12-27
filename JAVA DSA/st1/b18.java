
import java.util.*;

public class b18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i = 0;
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (i = 0; i < 5; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }

        System.out.println(max);

        for (i = 0; i < 5; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println(min);

        int sub = arr[0];
        for (i = 1; i < 5; i++) {

            sub = sub - arr[i];
        }

        if (sub >= 0) {
            System.out.println("Subtraction result is grater than or equal to zero");
        } else {
            System.out.println("Subtraction result is less than zero");
        }

    }
}
