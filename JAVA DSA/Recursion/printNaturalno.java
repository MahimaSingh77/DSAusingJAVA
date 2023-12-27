//printing natural number

import java.util.*;
// public class printNaturalno{
//     public static void pI(int n){
//             if(n==1){
//                 System.out.println(n);
//                 return;
//             }

//             pI(n-1);
//             System.out.println(n);
            
//     }
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         pI(a);


//     }
// }



//printing reverse

public class printNaturalno{
    public static void pD(int n){
            if(n==1){
                System.out.println(n);
                return;
            }

            
            System.out.println(n);
            pD(n-1);
            
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        pD(a);


    }
}

