// import java.util.*;

// public class ust {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int T = scanner.nextInt(); // Number of test cases
//         for (int t = 0; t < T; t++) {
//             int N = scanner.nextInt(); // Size of the array A
//             int X = scanner.nextInt(); // Integer X
//             int[] A = new int[N]; // Array A
//             for (int i = 0; i < N; i++) {
//                 A[i] = scanner.nextInt();
//             }
            
//             // Calculate modified array B elements
//             int[] B = calculateModifiedArray(A, X);
            
//             // Count the number of distinct gcds
//             Set<Integer> gcdSet = new HashSet<>();
//             for (int num : B) {
//                 gcdSet.add(calculateGCD(num, X));
//             }
            
//             System.out.println(gcdSet.size());
//         }
//     }

//     // Function to calculate GCD of two numbers
//     public static int calculateGCD(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return calculateGCD(b, a % b);
//     }
    
//     // Function to calculate modified array B elements
//     public static int[] calculateModifiedArray(int[] A, int X) {
//         int[] B = new int[A.length];
        
//         int sumA = 0;
//         for (int num : A) {
//             sumA += num;
//         }
        
//         for (int i = 0; i < A.length; i++) {
//             int diff = (X - A[i] % X) % X;
//             B[i] = A[i] + diff;
//         }
        
//         int diffSum = sumA - Arrays.stream(B).sum();
//         B[B.length - 1] += diffSum;
        
//         return B;
//     }
// }


import java.util.*;

public class ust {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Size of the array A
            int X = scanner.nextInt(); // Integer X
            int[] A = new int[N]; // Array A
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            
            // Calculate modified array B elements
            int[] B = calculateModifiedArray(A, X);
            
            // Calculate gcd of modified array B
            int modifiedGCD = calculateGCD(B);
            
            System.out.println(modifiedGCD);
        }
    }

    // Function to calculate GCD of two numbers
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
    
    // Function to calculate GCD of an array of numbers
    public static int calculateGCD(int[] array) {
        int gcd = array[0];
        for (int i = 1; i < array.length; i++) {
            gcd = calculateGCD(gcd, array[i]);
        }
        return gcd;
    }
    
    // Function to calculate modified array B elements
    public static int[] calculateModifiedArray(int[] A, int X) {
        int[] B = new int[A.length];
        int sumA = 0;
        
        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
            B[i] = A[i] + (X - A[i] % X) % X;
        }
        
        int diffSum = sumA - Arrays.stream(B).sum();
        B[B.length - 1] += diffSum;
        
        return B;
    }
}

