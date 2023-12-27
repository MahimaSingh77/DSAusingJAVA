// 1.Write a program in JAVA to find the length of a String without using the library /
import java.util.*;
public class q1length{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int count=0;
       for(int i=0; i<str.length();i++){
        count++;
       }
       System.out.println(count);

    }
}