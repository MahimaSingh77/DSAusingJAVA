import java.util.Scanner;
public class a16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNumber = sc.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println(binaryNumber);
    }
}
