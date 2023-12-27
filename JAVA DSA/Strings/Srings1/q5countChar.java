// package Srings1;
// 5. Write a program in Java to count the total number of alphabets, digits, and special
// characters in a string

import java.util.Scanner;

public class q5countChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int alphabets = 0;
        int digits = 0;
        int special_char = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alphabets++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                special_char++;
            }

        }

        System.out.println(alphabets + " " + digits + " " + special_char);
    }

}
