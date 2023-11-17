/*
 * A company has a program that processes employee data, including their names, IDs, and
salaries. Sometimes, the program encounters errors when processing the data, such as invalid IDs
or negative salaries. You need to implement exception handling to handle these errors and display
appropriate error messages to the user.
Input Format
First line input consists of String value that is name of Employee,
Second line input consists of Integer value that is Employee ID,
Third input consists double value that is Salary of Employee.
Output Format
The program provides the following outputs based on the input,
If all inputs are valid, it displays the message "Data Processed",
If the ID entered is less than or equal to 0, it displays the Exception "Invalid ID"
If the salary entered is negative, it displays the Exception "Invalid salary"
Note: if exception occurred in any input line, program will not continue it will just display
exception message
 */
import java.util.*;
public class c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        int salary = sc.nextInt();
        if(id<=0){
            System.out.println("Invalid ID");
        }
        

    }
}
