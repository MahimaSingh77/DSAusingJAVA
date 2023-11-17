/*
 * Q1. A finance company wants to calculate the total sales and the accountant needs to calculate the
exact amount of the total sales and he has been instructed to roundoff the obtained total to nearest
multiple of 10. So write a JAVA program to help the accountant to round the given number to
nearest multiple of 10
Input Format
Input consists of a positive integer value.
Output Format
Output consists of positive integer value which is rounded to the nearest whole number having
zero as last.
Sample Input 1
4722
Sample Output 1
4720
Sample Input 2
10
Sample Output 2
10

 */
import java.util.*;
public class d1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = n%10;
    if(a>=5){
        n = n+10 - a;
    }
    else{
        n = n - a;
    }

    System.out.println(n);
   } 
}
