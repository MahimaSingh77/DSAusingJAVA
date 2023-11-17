/* Write a program in Java to print individual 
characters of a string in reverse order.
*/

public class q9 {

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

        for (int i = separated.length-1; i >= 0; i--) {
            System.out.print(separated[i] + " ");
        }
    }

}