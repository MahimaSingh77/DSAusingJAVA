/*
 * Q1. You are working on a calculator program that accepts two integer numbers and performs
various mathematical operations. Implement exception handling to handle the case when the user
enters invalid input, such as zero or non-numeric values.
Input Format
First line of input consists integer value, that is num1,
Second line of input consists integer value, that is num2.
Output Format
Output will be dependent on input,
If user enters num1 < 0, it should print – “First number is Zero”
If user enters num2 < 0, it should print – “Second number is Zero”
If user enters non integer value handle the related java exception,
If no exception found, print addition, subtraction, multiplication, division of num1, num2 each in
new line.
Sample Input 1
0
1111
Sample Output 1
First number is Zero
 */
import java.util.*;
public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        if(a == 0){
            System.out.println("First number is 0");

            if(b == 0){
                System.out.println("Second number is 0");
            }
        }

      else{ 
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
      }
       
    }
}
