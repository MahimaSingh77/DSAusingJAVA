
//Check whether two strings are anagram of each other or not
import java.util.*;

public class q1Anagram {

    public static boolean isAnagram(String str1, String str2) {

        char[] c1 = new char[str1.length()];
        Arrays.sort(c1);

        char[] c2 = new char[str1.length()];
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(isAnagram(str1, str2));

    }
}
