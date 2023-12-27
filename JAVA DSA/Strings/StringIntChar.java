import java.util.*;

public class StringIntChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String+int/char/String
        String str = "abc";
        str = str + "def"; // String + String
        System.out.println(str); // abcdef

        str = str + 'm'; // String + char
        System.out.println(str); // abcdefm

        str = str + 10; // String + int
        System.out.println(str); // abcdefm10

        System.out.println("abc" + "xyz"); // abcxyz
        System.out.println("abc" + "a"); // abca
        System.out.println("abc" + 10); // abc10
        System.out.println("abc" + 10 + 20); // abc1020 not abc30

        System.out.println(10 + 20 + "abc"); // 30abc

        System.out.println("abc" + (10 + 20)); // abc30

    }

}
