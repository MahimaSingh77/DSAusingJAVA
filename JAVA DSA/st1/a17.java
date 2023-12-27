import java.util.*;
import java.lang.Math;

public class a17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int temp = number;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum += (Math.pow(rem, digits));
            number /= 10;

        }

        if (originalNumber == sum)

            return true;

        else {
            return false;
        }

    }
}


