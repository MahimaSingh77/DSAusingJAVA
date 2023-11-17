import java.util.*;

/*Given a string s, print all the substring of s 
 *  Input s="abcd";
    Output = a ab abc abcd b bc bcd c cd d
 */
public class q1printSubstring {

    public static void main(String[] args) {
        String s = "abcd";
        for (int i = 0; i <= 3; i++) {
            for (int j = i + 1; j <= 4; j++) {
                System.out.println(s.substring(i, j));
            }

        }
    }

}
