// package Srings1;
// 8. Write a Java program to check whether a given substring is present in the given string. 

import java.util.Scanner;

public class q8checkSubstring {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.nextLine();

        System.out.println(str.contains(sub));

    }
}
