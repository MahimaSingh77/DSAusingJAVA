
/*
substring(i,j) ans substring(i)
 */
import java.util.*;

public class SubstringFunc {
    public static void main(String[] args) {

        String str = "abcde";

        /*
         * Substring is continuous part of a string ({a} , {a,b} , {abc} , {b} , {bc} ,
         * {bcd}........)
         */

        System.out.println(str.substring(0, 2)); // ab
        System.out.println(str.substring(0, 4)); // abcd

        System.out.println(str.substring(2)); // cde

    }
}
