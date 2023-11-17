
//18 .Find missing number : Given an array containing n distinct numbers taken from 0,1,2,...,n,

import java.util.Scanner;

public class q18MissingNumber {

    public static int missing_num(int n, int[] arr) {

        int sum = (n - 1) * (n) / 2;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }

        int num = sum - sum2;
        return num;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(missing_num(n, arr));

    }
}
