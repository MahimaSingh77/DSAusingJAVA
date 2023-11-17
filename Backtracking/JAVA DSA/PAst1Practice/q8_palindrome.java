
// 8.Check Whether number is palindrome or not
import java.util.*;

public class q8_palindrome {
    public static boolean check_palindrome(int n) {
        boolean bool = false;
        int temp = n;
        int reversed_num = 0;
        while (temp > 0) {
            int last_digit = temp % 10;

            reversed_num = reversed_num * 10 + last_digit;

            temp = temp / 10;
        }

        System.out.println(reversed_num);

        if (n == reversed_num) {
            bool = true;
        }
        return bool;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check_palindrome(n));

    }
}
