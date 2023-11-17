// package Srings1;
// 9. Write a program in Java to read a sentence and replace lowercase characters with uppercase
// and vice versa. 

import java.util.Scanner;

public class q9toggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] str2 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 65 && ch <= 90) {
                ch += 32;
                str2[i] = ch;

            } else if (ch == ' ') {
                str2[i] = ' ';
            }

            else {
                ch -= 32;
                str2[i] = ch;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str2[i]);
        }

    }
}
