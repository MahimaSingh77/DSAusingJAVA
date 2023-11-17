
/*
Q2. Anagram is a word or phrase made by transposing the letters of another word or phrase
The word "secure" is an anagram of "rescue."
Write a program that takes two strings as input and checks if they are anagrams of each other. The program
should handle exceptions that may occur during input or processing.
Input format:
Two strings separated by a space.
Output format:
"YES" if the strings are anagrams of each other, "NO" otherwise as shown in sample test case.
*/
import java.util.*;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String str3 = new String(ch1);
        String str4 = new String(ch2);

        if (str3.equals(str4)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}
