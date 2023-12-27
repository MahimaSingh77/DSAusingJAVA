/* Write a program in Java to find
 the length of a string without using the library function. */
 import java.util.*;
 public class q7 {
    public static int calculateLength(String str) {
        int length = 0;
        
        // Keep incrementing length until we encounter an exception
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        
        return length;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = calculateLength(input);
        System.out.println("Length of the string: " + length);
    }
}
