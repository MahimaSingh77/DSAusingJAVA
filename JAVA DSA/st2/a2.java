/*
 * Q2: You are given provided with a string S and you have to take all even-indexed characters and
odd-indexed characters from a string and concatenates them together.
Input Format
The first line of the input contains the string S.
Output format
Print the string after merging.
Constraints
1 <= S <=1000
Time Limit
1 second
Sample Input
abcdefg
Sample Output
acegbdf
 */

import java.util.*;
public class a2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine(); 

       String str1 = "";
       String str2 = "";
       for(int i=0; i<str.length(); i++){
        if(i%2==0){
            str1 += str.charAt(i);
        }
        else{
            str2 += str.charAt(i);
        }
       }



   

   String str3 = str1.concat(str2);
   System.out.println(str3);

       

    }
}
