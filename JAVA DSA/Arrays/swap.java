/*Given 2 integers a and b. Swap the 2 given values using temporary variables */
import java.util.*;
public class swap {
static void swap(int n1 , int n2){

    int temp = n1;
    n1 = n2;
    n2 = temp;

    System.out.println(n1 + " " + n2);

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        swap(a,b);
        System.out.println(a + " " + b);
    }
}
