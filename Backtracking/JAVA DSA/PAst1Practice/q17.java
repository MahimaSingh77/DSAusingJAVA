//17. Majority Element : Given an array of integers , find the majority element (appears more than n/2 times) , assuming it always exists.

import java.util.Scanner;

public class q17 {

    public static int majority(int[] arr) {
        int n = arr.length;
        int element = arr[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count >= n / 2) {
                    element = arr[i];
                }
            }
        }
        return element;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(majority(arr));

    }
}
