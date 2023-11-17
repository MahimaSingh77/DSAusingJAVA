/*Given 2 integers a and b. Swap the 2 given values using sum and difference method */
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class swap2 {
    static void swap(int n1 , int n2){
        int sum = n1+n2;
        n1 = sum - n1;
        n2 = sum - n2;
        System.out.println(n1 + " " + n2);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        swap(a,b);

    }
}
