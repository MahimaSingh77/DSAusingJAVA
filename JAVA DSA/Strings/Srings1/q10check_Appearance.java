
// Write a program in Java to find the number of times a given word 'the' appears in the given
// string. 
import java.util.*;

public class q10check_Appearance {

    public static int check_Appearance(String str1, String str2) {
        int count = 0;
        String temp[] = str1.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals(str2)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(check_Appearance(str1, str2));

    }
}
