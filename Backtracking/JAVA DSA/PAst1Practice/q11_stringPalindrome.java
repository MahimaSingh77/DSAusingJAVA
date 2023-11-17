//11. Check whether the String is Palindrome or not

import java.util.*;

public class q11_stringPalindrome {

    public static boolean check_palindrome(String str) {

        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
        return (str.equals(rev));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        check_palindrome(str);
    }
}
