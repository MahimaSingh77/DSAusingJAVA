
/* Q18: Write a Java program to print a Water Image Mirror form of Star Dot pattern for a size
of N.
Input format:
The first line of the input contains the size of the pattern.
Constraints:
1 <= N <= 100
Output format:
The output will contain the mirror form of N sized pattern using star(*) and dot(.)
Sample Input:
4
Sample Output:
...*
..**
.***
****
****
.***
..**
...*
Explanation: -Use the dot(.) character in place of whitespace before the first star(*) character
of any row.
There is no space between star(*) characters.
There is no space after the last star(*) character.

*/

import java.util.*;

public class d18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(".");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
