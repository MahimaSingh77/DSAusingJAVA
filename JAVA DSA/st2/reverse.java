import java.util.*;
public class  reverse{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String input = scan.nextLine();
            int end = input.length();
            int i = input.length() - 1;
            String output = "";
            while (i >= 0) {
                if (input.charAt(i) == ' ') {
                    output = output + input.substring(i + 1, end) + " ";
                    end = i;
                }
                i--;
            }
            output += input.substring(i + 1, end);
            System.out.println(output);
        }

    }

}

