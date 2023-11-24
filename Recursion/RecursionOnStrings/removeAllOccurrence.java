
//Remove all the occurrences of 'a' from a given string str.

import java.util.*;

public class removeAllOccurrence {
    // static String remove(String str, String newStr, int idx) {
    // if (idx >= str.length()) {
    // return newStr;
    // }
    // if (str.charAt(idx) != 'a') {

    // newStr += str.charAt(idx);

    // }
    // return remove(str, newStr, idx + 1);

    // }





     static String remove(String str , int idx) {
        if (idx == str.length()) {
            return "";
        }

        String smallAns = remove(str , idx+1);
        char currChar = str.charAt(idx);
        if (currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }

    }




    // static String remove(String str) {
    //     if (str.length() == 0) {
    //         return "";
    //     }

    //     String smallAns = remove(str.substring(1));
    //     char currChar = str.charAt(0);
    //     if (currChar != 'a') {
    //         return currChar + smallAns;
    //     } else {
    //         return smallAns;
    //     }

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        System.out.println(remove(str , 0));
    }
}
