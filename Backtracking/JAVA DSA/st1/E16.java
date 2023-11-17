/*
 * Q16. Imagine you are a software developer working on a program that checks the divisibility
of a positive integer n, given by the user. The program should follow the rules below:
If the integer is divisible by 2, print "Two".
If it is divisible by 3, print "Three".
If it is divisible by 11, print "Eleven".
If it is not divisible by any of the above three rules, print "-1".
Note: If N is divisible by more than one of the above given numbers, print the one which is
largest.
Input format:
First line contains an integer N.
Output format:
Output the string as required.
Sample Input:
3
Sample Output:
Three

 */

 /* Imagine you are a software developer working on a program that checks the divisibility
of a positive integer n, given by the user. The program should follow the rules below:
If the integer is divisible by 2, print "Two".
If it is divisible by 3, print "Three".
If it is divisible by 11, print "Eleven".
If it is not divisible by any of the above three rules, print "-1".
Note: If N is divisible by more than one of the above given numbers, print the one which is
largest.
Input format:
First line contains an integer N.
Output format:
Output the string as required.
Sample Input:
3
Sample Output:
Three
Sample Input:
 */
  
 import java.util.*;
 public class E16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%11==0){
            System.out.println("Two");

        }
      
        else if( n%3==0){
            System.out.println("Three");
        }
        else if(n%2==0){
            System.out.println("Eleven");
        }
        else{
            System.out.println("-1");
        }

        
    }
 }