/* public class throwThrows {

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception");

        }
    }
}
*/

import java.util.*;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative ! ";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class throwThrows {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {
        try {
            double c = area(-1);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception");

        }
    }
}
