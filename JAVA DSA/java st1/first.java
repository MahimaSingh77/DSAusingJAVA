/* 
public class first{


public static void main (String args []){
    if (" STRING ".toUpperCase() == "STRING")
     System.out.println ("Equal");
    else
     System.out.println ("Not Equal");
    }
    }
*/

public class first {
    /* 
    public static void main(String[] args) {
        try {
            String str = null;
            String newStr = str.substring(0, 5);
            System.out.println(newStr);
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException caught");
        }
    }
    */
    public static void main(String[] args) {
    String str = "Hello";
    str.replace("H", "J");
    System.out.println(str);
}
}