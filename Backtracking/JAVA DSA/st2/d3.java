
/*
 * Write a program to print the count of words and print the first letter of every word as well as
their corresponding ASCII values in a user input string separated by space.
Note : Assume there is a single space between two words and there are no extra spaces before
and after words.
Input format:
First line of the input contains the user input string.
Output format:
On a single line of output print the count of word <space> first letter of each word with their
corresponding ASCII values(space separated).
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input:
Hello My a
Sample Output:
3 H72 M77 a97
Sample Input:
Who are you m friend?
Sample Output:
5 W87 a97 y121 m109 f102
 */
import java.util.*;

public class d3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == ' ') {
              
                count++;
            }
        }
        System.out.print(count + 1 + " ");
        int ascii0 = ch[0];
        System.out.print(ch[0] + "" + ascii0);
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == ' ') {
                char c = ch[i + 1];
                int ascii = ch[i + 1];
                System.out.print(" " + c + ascii);
            }
        }

    }
}
