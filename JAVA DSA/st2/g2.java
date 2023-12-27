
/*
 * Q2: Given total runs scored and total overs faced as the input. Write a program to calculate the
run rate with the formula, Run rate= total runs scored/total overs faced.Use Scanner class to get
the inputs from user. This program may generate Arithmetic Exception / InputMismatchException.
Use exception handling mechanisms to handle this exception.
Use a single catch block. In the catch block, print the class name of the exception thrown.
Input format:
First line of the input contains Enter the total runs scored.
Second line contains Enter the total overs faced
Output format:
First Line contains Current Run Rate : then value or Exception Message
Sample Input:
Enter the total runs scored
79
Enter the total overs faced
14
Sample Output:
Current Run Rate : 5.00
 */
import java.util.*;

public class g2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int runs = sc.nextInt();
            int overs = sc.nextInt();
            float RunRate = (float)runs/overs;
            System.out.println(RunRate);




        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured");
        }
        catch (InputMismatchException e) {
            System.out.println("Input Mismatch exception occured");
        }
    }
}
