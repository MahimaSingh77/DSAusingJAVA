import java.util.*;

public class q6lowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int ascii = (int)ch;

        System.out.println(ascii);

        if (ascii >= 97 && ascii <= 122) {
            System.out.println("lowercase");
        } else if (ascii >= 65 && ascii <= 90) {
            System.out.println("UPPERCASE");

        }

        else {
            System.out.println("other character");
        }

    }
}
