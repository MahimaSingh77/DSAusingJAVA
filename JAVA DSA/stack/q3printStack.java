
/*Print element of the stack */
import java.util.*;

public class q3printStack {
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * Stack<Integer> st = new Stack<>();
     * int n;
     * System.out.println("Enter the number of elements in the stack : ");
     * n = sc.nextInt();
     * System.out.println("Enter the elements in the stack : ");
     * for (int i = 0; i < n; i++) {
     * int x = sc.nextInt();
     * st.push(x);
     * }
     * 
     * Stack<Integer> gt = new Stack<>();
     * while(st.size() > 0){
     * gt.push(st.pop());
     * }
     * while(gt.size() > 0){
     * System.out.print(gt.peek() + " ");
     * st.push(gt.pop());
     * }
     * 
     * 
     * }
     */



         
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements in the stack : ");
        n = sc.nextInt();
        System.out.println("Enter the elements in the stack : ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        
        int[] arr = new int[n];

        for (int i = n-1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    */
}
