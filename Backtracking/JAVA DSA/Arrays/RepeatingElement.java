
/*Given an array 'a' consisting of integers. Return the first value that is repeating in this array.
 If no value is being repeated , return -1.
 */
import java.util.*;

public class RepeatingElement {
    int a = -1;

    void FirstRepeatingElement(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    a = arr[i];
                    break;
                }
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        RepeatingElement obj = new RepeatingElement();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        obj.FirstRepeatingElement(n, arr);
    }
}
