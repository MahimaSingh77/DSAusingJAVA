
/*
 *Q2. Write a program that takes a string input and returns the number of vowels in the string. The program
should handle exceptions that may occur during input or processing.
Input format:
A single string input.
Output format:
An integer representing the number of vowels in the input string.
Sample Input 1:
"Hello, World!"
Sample Output 1:
3
Sample Input 2:
"bcd"
Sample Output 2:
0

 */
import java.util.*;

public class h2 {
    public static void countVowels(String str) {
        int count = 0;
        int i = 0;

        for (i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == '0' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String str = sc.nextLine();
            countVowels(str);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
