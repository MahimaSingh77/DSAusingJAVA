/*******
 * Given an String Hello.Change the second character and Make it Heylo
 **********/
public class q2ChangeInString {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder str1 = new StringBuilder(str);
        str1.setCharAt(2,'y');
        System.out.println(str1);

    }
}
