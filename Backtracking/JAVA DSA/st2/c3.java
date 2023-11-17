/*
 * Given a string, S, find and return the highest occurring character present in the given string.
If there are 2 characters in the input string with the same frequency, return the character which
comes first.
Note : Assume all the characters in the given string are either uppercase or lowercase or both.
Spaces are not considered as characters therefore should not be outputted or counted. If length is
zero then print count only.
Input format :
String S
Output format :
Highest occurring character
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
H M N RR SS rr
Sample Output 1:
2 R
Sample Input 2:
Hello
Sample Output 2:
2 l
 */
import java.util.*;
public class c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char [] ch = str.toCharArray();

        int [] freq = new int[str.length()];
        
        char maxchar = ch[0];
        for(int i = 0 ; i < ch.length; i++){
            freq[i]=0;
            for(int j = 0 ; j < ch.length; j++){
                if(ch[i]==ch[j] && ch[i]!=' '){
                    freq[i]++;
                }
            }
        }
        int max = freq[0];
        for(int i = 0 ; i < freq.length;i++){
            if(max<freq[i]){
                max=freq[i];
                maxchar=ch[i];
            }
        }
        System.out.println(max + " " + maxchar);
    }


   } 
