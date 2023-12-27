// import java.util.*;

// public class p1fibonacci {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 0;
//         int b = 1;
//         int c;
//         for (int i = 0; i < n; i++) {
//             if (i == 0) {
//                 System.out.print(0 + " ");
//             }
//             if (i == 0) {
//                 System.out.print(1 + " ");
//             }
//             c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;

//         }
//     }

// }




/*Using 2 variables only */

// import java.util.*;

// public class p1fibonacci {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 0;
//         int b = 1;

//         for (int i = 0; i < n; i++) {
//             if (i == 0) {
//                 System.out.print(0 + " ");
//             }
//             if (i == 1) {
//                 System.out.print(1 + " ");
//             }

//             System.out.print(a+b + " ");

//             b = a+b;
//             a=b-a;

//         }
//     }
// }









/*Through Recursion */
// import java.util.*;

// public class p1fibonacci {

//     public static int fib(int n) {
//         if (n < 1) {
//             return n;

//         }

//         return fib(n - 1) + fib(n - 2);

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(fib(n));

//     }
// }


import java.util.*;

public class p1fibonacci {
    static int m =0;
    public static int fib(int n ) {
        m++;
       
        if (n < 1) {
            return n;

        }
System.out.println(m);
        return fib(n - 1) + fib(n - 2 );

        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        System.out.println(fib(n ));
        
    }
}
