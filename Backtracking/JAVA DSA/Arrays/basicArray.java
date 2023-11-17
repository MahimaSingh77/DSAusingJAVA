import java.util.*;
// Calculate the sum of all the elements in the given array
// public class basicArray {
//     void sum(){
//    int[] arr = {1,5,3};
//         int sum = 0;
//             for(int i=0; i<arr.length; i++){
//                     sum = sum + arr[i];
//             }
//             System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         basicArray obj = new basicArray();

        
//         obj.sum();
//     }
// }



/* Calculate the maximum value out of all the elements in an array

public class basicArray{
    void max(){
        int i=0;
        int[] arr={1,5,3};
        int max = arr[i];
        for(i=0; i<arr.length ; i++){
            if(arr[i]>=max){
                max = arr[i];
            } 
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        basicArray obj = new basicArray();
        obj.max();
    }
}
*/

// Search the given element x in the array.If present then return the index else return -1.
// public class basicArray{
// void search(){
//        int[] arr = {1,5,3};
//         int x = 5;
//         int flag= -1;
//         for(int i=1; i<=arr.length; i++){
//             if(arr[i] == x){
//                     flag=i;
//                     break;
//             }
            
//         }
//             System.out.println(flag);
       
//     }
//     public static void main(String[] args) {
//         basicArray obj = new basicArray();
//         obj.search();
//     }
// }

//******Count the number of occurrence of a particular element x*******/
/* 
class basicArray{
        void count(int n , int[] arr , int key){
            int count = 0;
                for(int i=0; i<n; i++){
                    if(arr[i] == key){
                        count++;
                    }
                }
                System.out.println(count);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        basicArray obj = new basicArray();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
        }
        int key = 7;
        obj.count(n , arr , key);
    }
}
*/

//************Count the number of elements strictly greater than value x**********/
/*
class basicArray{
    void count(int n , int[] arr , int key){
        int count = 0;
            for(int i=0; i<n; i++){
                if(arr[i] > key){
                    count++;
                }
            }
            System.out.println(count);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    basicArray obj = new basicArray();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
    }
    int key = 7;
    obj.count(n , arr , key);
}
}

*/


/*****************Check if the given array is sorted or not**********/
/* class basicArray{
    void sorted(int n, int[] arr){
        int flag = 1;
        for(int i=1; i<n ; i++ ){
            if(arr[i-1]>arr[i-1] ){
                flag = 0;
                break;
            }
            
        }
        System.out.println(flag);
    }
     
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    basicArray obj = new basicArray();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
    }
    obj.sorted(n , arr);
    }
}

*/



 // Java Recursive approach to check if an
// Array is sorted or not
// class binaryArray {

// 	// Function that returns true if array is
// 	// sorted in non-decreasing order.
// 	static boolean arraySortedOrNot(int a[], int n)
// 	{
// 		// base case
// 		if (n == 1 || n == 0)
// 			return true;
	
// 		// check if present index and index
// 		// previous to it are in correct order
// 		// and rest of the array is also sorted
// 		// if true then return true else return
// 		// false
// 		return a[n - 1] >= a[n - 2]
// 			&& arraySortedOrNot(a, n - 1);
// 	}

// 	// Driver code
// 	public static void main(String[] args)
// 	{

// 		int arr[] = { 20, 23, 23, 45, 78, 88 };
// 		int n = arr.length;
		
// 		// Function Call
// 		if (arraySortedOrNot(arr, n))
// 			System.out.print("Yes");
// 		else
// 			System.out.print("No");
// 	}
// }


 


