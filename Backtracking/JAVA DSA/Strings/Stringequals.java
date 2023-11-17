/*str1.equals(str2) and == operator*/
import java.util.*;
public class Stringequals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        //  using ==
        System.out.println(s1==s2);  //true
        System.out.println(s1==s3);  //false

        // using s1.equals(s2)
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals(s3));  //true
    }
    
}
