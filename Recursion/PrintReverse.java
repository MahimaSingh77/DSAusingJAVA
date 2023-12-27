import java.util.*;

public class PrintReverse {

    // static void reverse(String s , int idx){

    // if(idx==s.length()){
    // return;
    // }

    // reverse(s, idx+1);
    // System.out.print(s.charAt(idx));

    // }

    static String reverse(String s, int idx, String newStr) {

        if (idx == s.length()) {
            return "";
        }

        reverse(s, idx + 1, newStr);
        newStr += s.charAt(idx);

        return newStr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String newStr = "";

        System.out.println(reverse(s, 0, newStr));

    }
}