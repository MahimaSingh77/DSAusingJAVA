
/*
 2. Rajan is writing some code in a project that contains an array of employee. He needs to search
for an employee with the given id. In case the employee is found, the employee object is returned
else an exception is thrown with the message “employee not found”. Write the method to search
the employee and create a class that extends Exception and override the method getMessage().
Input format:
Input is N, number of employees
N lines containing, id and name of the employee
X, an integer containing the id to search
Output format:
Name of the employee if found.
Exception, in case the employee is not found.
Sample Input:
3
1 sumit
2 rajan
3 sumit
5
Sample Output:
employee not found

 */

import java.util.*;

public class d2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        String[] str = new String[n];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            str[i] = sc.nextLine();
        }

        int key = sc.nextInt();
        boolean bool = false;

        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println(str[i]);
                bool = true;

            }

        }

        if (bool) {
            System.out.println("Employee Not FOund");
        }

    }
}
