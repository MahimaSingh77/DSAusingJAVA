
// 3. Write a program in Java to print individual characters of a string in reverse order. 

import java.util.Scanner;

public class q3separateReverse {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i) + " ");
         }
    }
    
}
