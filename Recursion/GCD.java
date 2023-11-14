import java.util.Scanner;
// public class GCD{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a<=b){
//             for(int i=a; i>0; i--){
//                 if(b%i==0 && a%i==0){
//                     System.out.println("GCD is " + i);
//                     break;
//                 }

//             }
//         }
//         else{
//              for(int i=b; i>0; i--){
//                 if(a%i==0 && b%i==0){
//                     System.out.println("GCD is " + i);
//                     break;
//                 }

//             }

//         }

//     }
// }

// public class GCD {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();

//         while (x % y != 0) {
//             int rem = x % y;
//             x = y;
//             y = rem;

//         }
//         System.out.println(y);

//     }
// }

public class GCD {
    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }

        return gcd(y, x % y);          //logic can be understood as division method
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int g = gcd(x, y);

        System.out.println(g);

    }
}