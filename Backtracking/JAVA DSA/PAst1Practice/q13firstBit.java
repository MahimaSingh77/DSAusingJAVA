import java.util.*;
// find the first set bit of the given number from left in java

public class q13firstBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int Total_bit = 1;
        while (n != 0) {
            int rem = n % 2;
            if (rem == 0) {
                count++;
            } else {
                break;
            }

            n /= 2;
        }

        while (n != 0) {

            Total_bit++;
            n /= 2;
        }

        System.out.println("first set bit from right" + count);
        int left = Total_bit - count;
        System.out.println("first set bit from leftt" + " " + left);
    }

}