import java.util.*;

public class b16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int square = number * number;
        int sum = 0;
       
        while (square > 0) {
            int rem = square % 10;
            sum += rem;
            square /= 10;
        }
      
        if (sum == number) {
            System.out.println("Given number is a neon number. ");
        }

        else {
            System.out.println("Given number is not a neon number . ");
        }

    }
}