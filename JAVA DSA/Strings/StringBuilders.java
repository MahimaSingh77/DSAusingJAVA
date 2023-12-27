import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        
        /*  StringBuilder str = new StringBuilder("Hello");
          //str += "world"; //cannot do this
           str.setCharAt(0, 'M'); // setCharAt func
         * str.append(" World"); // Append func
         * System.out.println(str); // Mello World
         * 
         * str.insert(2, "P");
         * System.out.println(str); //Mepllo World
         * 
         * str.deleteCharAt(2);
         * System.out.println(str); //Mello World
         * 
         * 
         */

        StringBuilder sb = new StringBuilder("Physics");
        sb.reverse();
        System.out.println(sb); // scisyhP
        sb.reverse();
        sb.delete(2, 4); // 2 to 3 will be deleted
        System.out.println(sb); // Phics

    }
}
