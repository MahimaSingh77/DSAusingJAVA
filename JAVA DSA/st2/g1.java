
/*
1. Write a function to check whether two given strings are Permutation of each other or not.
A Permutation of a string is another string that contains same characters, only the order of
characters can be different.
For example, “abcd” and “dabc” are Permutation of each other.
Input format:
Accept two strings
Output format:
1 if the strings are permutations of each other. 0 if the strings are not permutation of each
other. As specified in sample Ouput
Test Cases:
Input Output
abc bca 1: abc and bca are permutable
raw was 0: raw and was are not permutable
*/
import java.io.*;
import java.util.*;
public class g1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String str3 = new String(c1);
        String str4 = new String(c2);

        if(str3.equals(str4)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
