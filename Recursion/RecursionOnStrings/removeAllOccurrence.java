
//Remove all the occurrences of 'a' from a given string str.

import java.util.*;

public class removeAllOccurrence {
    static String remove(String str, String newStr, int idx) {
        if (idx >= str.length()) {
            return newStr;
        }
        if (str.charAt(idx) != 'a') {

            newStr += str.charAt(idx);

        }
        return remove(str, newStr, idx + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        System.out.println(remove(str, newStr, 0));
    }
}
