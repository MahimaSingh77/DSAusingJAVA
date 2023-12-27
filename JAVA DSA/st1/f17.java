/*
 *  Suppose you are working on a project that requires you to create a program that takes an
integer input from the user and then reverses it. Your program should be able to handle any
integer value provided by the user. Your task is to write a program that accepts an integer N
and reverses it. The reversed integer should be printed to the console.
Input format:
The first line contains an integer T, total number of test cases. Then follow T lines, each line
contains an integer N.
Output format:
For each test case, display the reverse of the given number N, in a new line.
Sample Input:
2
12345
31203
Sample Output:
54321
30213

 */
import java.util.*;
public class f17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int a = sc.nextInt();
            
        }
        while(n>0){
            int ans = 0;
            while(a>0){
                ans = ans*10 + a%10;
                a=a/10;
            }
            System.out.println(ans);
        }
    }
}
