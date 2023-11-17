/*Write a program that allows you to keep accessing an array until a valid index is given by the user */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] =6;
        boolean flag = true;
    while (flag) { 
      try{
            int i = sc.nextInt();
            System.out.println(arr[i]);
            flag = false;
         }
         catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Enter valid index ");
         }
        }
    }
}
