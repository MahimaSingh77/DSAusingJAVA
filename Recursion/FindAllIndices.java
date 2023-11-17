//given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array.

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllIndices {

    static ArrayList<Integer> find(int[] arr, int idx, int key) {
        ArrayList<Integer> ans = new ArrayList<>(); 
        // base case
        if (idx >= arr.length) {
            return ans; // return empty arrayList
        }

        //Self Work
        if (arr[idx] == key)
            ans.add(idx);

        //recursive work
        ArrayList<Integer> smallAns = find(arr, idx + 1, key);


        ans.addAll(smallAns);

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        ArrayList<Integer> ans = find(arr, 0, key);

        for (Integer i : ans) {
            System.out.println(i);
        }

    }
}
