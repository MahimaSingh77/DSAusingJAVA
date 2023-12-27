import java.util.*;

public class s1StringBuiltInFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "HellovWorld"; // Declaration and initialisation
        System.out.println(str1);

        
          String str2 = sc.next(); // reads only till the first space and ignores the         
          System.out.println(str2);
          
          sc.nextLine();
          
          String str3 = sc.nextLine(); // reads the whole input with the spaces.
          System.out.println(str3);
         
        // length function
        System.out.println(str1.length());

        // charAT function
        char ch = str1.charAt(3);
        System.out.println(ch);
        
        // indexOf function
        int index1 = str1.indexOf(ch);
        int index2 = str1.indexOf('o');

        System.out.println(index1 + "," + index2);

        // compareTo
        System.out.println("compareTo function");
        String str4 = "Hello";
        String str5 = "Hello";
        String str6 = "Fello";
        String str7 = "Iello";

        System.out.println(str4.compareTo(str5)); // 0 as both string are equal.
        System.out.println(str4.compareTo(str6)); // 2 as str4 is greater(by 2 length{F , G, H}) FROM str6.
        System.out.println(str4.compareTo(str7)); // -1 as str4 is smaller(by 1 length{H , I}) FROM str7.

        // contains
        System.out.println("contains function");
        String str8 = "Hello There";
        System.out.println(str8.contains("her")); // true
        System.out.println(str8.contains("hehhh")); // false

        // startsWith
        System.out.println("startsWith function");
        System.out.println(str8.startsWith("Hel")); // true

        // endsWith
        System.out.println("endsWith function");
        System.out.println(str8.endsWith("re")); // true

        // toLowerCase
        String str9 = "Mahima Singh";
        System.out.println(str9.toLowerCase()); // mahima singh
        // toUpperCase
        System.out.println(str9.toUpperCase()); // MAHIMA SINGH

        // concat
        String s1 = "abc";
        String s2 = "def ght";

        System.out.println(s1.concat(s2)); // absdef ght
        
       
      

        

    }
}