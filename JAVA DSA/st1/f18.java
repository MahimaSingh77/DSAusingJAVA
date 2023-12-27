
/*
 * 8: You are provided with three numbers: input1, input2, and input3. Each of these is a fourdigit number within the range >=1000 and <=9999, i.e. 1000 >= input1 <= 9999, 1000
>=input2 <= 9999, 1000 >=input3 <= 9999. Write a JAVA program to find a Key using the
below formula:
Key = [SMALLEST digit in the thousands place of all three numbers] [LARGEST digit in
the hundreds place of all three numbers] [SMALLEST digit in the tens place of all three
numbers] [LARGEST digit in the units place of all three numbers].
Input Format
The input consists of three space-separated four-digit integers - input1, input2, and input3.
Output Format
Print an integer representing the concatenation of four digits where the first digit from the left
represents the smallest digit in the thousands place of all three numbers; the second digit
represents the largest digit in the hundreds place of all three numbers; the third digit
represents the smallest digit in the tens place of all three numbers, and the fourth digit
represents the largest digit in the unit place of all three numbers.
Sample Input 1
3521 2452 1352
Sample Output 1
1522
 */
import java.util.*;

public class f18 {

    public static void min(int a, int b, int c) {
        int min;
        if (a < b & a < c) {
            min = a;
        } else if (b < a & b < c) {
            min = b;
        } else {
            min = c;
        }
        System.out.print(min);

    }
    public static void max(int a, int b, int c) {
        int max;
        if (a > b & a > c) {
            max = a;
        } else if (b > a & b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.print(max);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        min(a / 1000, b  / 1000, c / 1000);
        max(a / 100 % 10, b / 100 % 10, c / 100 % 10);
        min(a / 10 % 10, b / 10 % 10, c / 10 % 10);
        max(a  % 10, b  % 10, c % 10);
        

    }
}
