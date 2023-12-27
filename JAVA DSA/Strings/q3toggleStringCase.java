
/*Given a string , the task is to toggle all the characters of the string i.e to convert Upper Case to Lower case and vice versa
 * input : PhysICS;
 * Output : pHYSics;
 */

import java.util.*;

public class q3toggleStringCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = str.length();
        char[] str2 = new char[n];
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            
            if (ch > 65 && ch < 90) {
                ch += 32;
                str2[i] = ch;
            }

            else if (ch == ' ') {
                str2[i] = ' ';
            }

            else {

                ch -= 32;
                str2[i] = ch;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(str2[i]);
        }

    }
}

// import java.util.*;

// public class q3toggleStringCase {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// StringBuilder str = new StringBuilder(sc.nextLine());

// // toggle
// for (int i = 0; i < str.length(); i++) {
// boolean flag = true;
// char ch = str.charAt(i);
// if (ch == ' ') {
// continue;
// }
// int ascii = (int) ch;
// if (ascii >= 97) {
// flag = false;
// }

// if (flag == true) {
// ascii += 32;
// char dh = (char) ascii;
// str.setCharAt(i, dh);
// }

// else {
// ascii -= 32;
// char dh = (char) ascii;
// str.setCharAt(i, dh);
// }

// }
// System.out.println(str);

// }
// }
