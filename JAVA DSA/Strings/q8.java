
/*Write a program in Java to separate the individual characters from a string. */
import java.util.*;

public class q8 {

    public static char[] separateString(String str) {
        char[] characters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }

        return characters;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        char[] separated = separateString(input);

        System.out.println("Individual characters:");

        for (int i = 0; i < separated.length; i++) {
            System.out.print(separated[i] + " ");
        }
    }

}
