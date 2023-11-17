/*
 * You are provided with three numbers w,h,r where w is the width and h is the height of the rectangle
and r is the radius of the circle and you have to check if the rectangle fits inside the circle or
not.
Input Format
The first line of the input three integers w,h and r.
Output format
Print “true” if the rectangle fits inside the circle else print “false”(without quotes).
Constraints
1 <= w,h,r <=1000
Time Limit
1 second
Example
Sample Input
8 6 5
Sample Output
true

 */
import java.util.*;
public class h3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        float r = sc.nextInt();

double diameter = 2*r;
double diagonal = Math.sqrt(w*w + h*h);

if(diameter>=diagonal){
    System.out.println("true");
}
else{
    System.out.println("false");
}
    }
}
