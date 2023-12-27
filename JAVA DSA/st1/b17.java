import java.util.*;

public class b17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        while (number > 0) {
            int rem = number % 2;
            if (rem != 0) {
                count++;
            }
            number /= 2;
        }

        System.out.println(count);
    }
}
