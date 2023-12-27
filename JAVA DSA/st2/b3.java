/*
 * You are given provided with a string S and you have to reverse case i.e. all lower-cased characters
should be upper-cased and all upper-cased character should be lower-cased.
Input Format
The first line of the input contains a string S.
Output format
Print a string after reversing the case.
Constraints
1 <= S.length <=1000
Sample Input
Happy Birthday
Sample Output
hAPPY bIRTHDAY
 */
import java.util.*;
public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0 ;i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' & ch <= 'Z' ){
                Character.toLowerCase(ch);
            }
            else if(ch == ' '){
                continue;
            }
            else{
                Character.toUpperCase(ch);
            }
            
        }

        System.out.println(sb);

        
    }
}
