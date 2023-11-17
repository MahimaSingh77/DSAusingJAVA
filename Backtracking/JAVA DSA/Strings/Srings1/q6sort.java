// package Srings1;
// 6. Write a program in Java to read a string through the keyboard and sort it using bubble sort.

import java.util.*;

public class q6sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);

        }
        Arrays.sort(arr);
        StringBuilder str2 = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            str2.append(arr[i]);

        }

        System.out.println(str2);

    }
}
