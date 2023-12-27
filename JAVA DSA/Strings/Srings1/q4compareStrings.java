// // package Srings1;
// Write a program in Java to compare two strings.

import java.util.Scanner;

public class q4compareStrings {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str1 = sc.nextLine();
         String str2 = sc.nextLine();

         System.out.println(str1.compareTo(str2));
         System.out.println(str1.equals(str2));

    }
}
