
/*
 * Write a Java program to reverse each word of a string individually.
Input Format :
String S
Output Format :
Modified reversed string
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Chitkara
Sample Output 1:
emocleW ot araktihC
Sample Input 2:
Give proper names to Class
Sample Output 2:
eviG reporp seman ot ssalC
 */
/* 
import java.util.*;
public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans.append(sb);
                ans.append(" ");

                sb = new StringBuilder("");

            }
        }

        sb.reverse();
        ans.append(sb);
        System.out.println(ans);

    }
}
*/
import java.util.Scanner;

// public class a3
// {  
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         String inputString = scan.nextLine();
//         String[] words = inputString.split(" ");
         
//         String reverseString = "";
         
//         for (int i = 0; i < words.length; i++) 
//         {
//             String word = words[i];
             
//             String reverseWord = "";
             
//             for (int j = word.length()-1; j >= 0; j--) 
//             {
//                 reverseWord = reverseWord + word.charAt(j);
//             }
             
//             reverseString = reverseString + reverseWord + " ";
//         }     
//         System.out.println(reverseString);
        
//     }
// }

public class a3
{  
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        String[] words = inputString.split(" ");
        String ReversedString = "";
        for(int i=0; i<words.length; i++){
            String ReversedWord = "";
            String word = words[i];
            for(int j=word.length()-1; j >=0 ; j--){
                ReversedWord += word.charAt(j);

            }
            ReversedString += ReversedWord ;
            if(i<words.length-1){
                ReversedString += " ";
            }

        }
        System.out.println(ReversedString  );
        
    }
}