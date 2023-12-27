
/*Find the second largest element in an array */
import java.util.*;

public class secondLargest {

    void secondlargestElement(int n, int[] arr) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        for (int i = 0; i < n; i++) {

            if (arr[i] > max2 && arr[i] != max) {

                max2 = arr[i];

            }

        }

        System.out.println("largest element = " + max);
        System.out.println("Second largest element = " + max2);

    }

    public static void main(String[] args) {
        secondLargest obj = new secondLargest();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        obj.secondlargestElement(n, arr);
    }
}
