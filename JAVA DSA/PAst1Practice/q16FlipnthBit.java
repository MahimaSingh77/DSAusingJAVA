import java.util.*;

// 16. Flip the nth bit of the given integer

public class q16FlipnthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(n ^ (1 << (k - 1)));
    }
}
