//move stack in same order;
import java.util.*;


public class q1copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements : ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("st stack is : " + st);
        // reverse order
        Stack<Integer> rt = new Stack<>();

        for(int i=0; i<n; i++){
            int x = st.peek();
            rt.push(x);
            st.pop();

        }
        // System.out.println(rt);

       Stack<Integer> ct = new Stack<>();

      while(rt.size()>0){
          int x = rt.peek();
          ct.push(x);
          rt.pop();
        
      }
      System.out.println("ct stack is : " + ct);

  
    }
   

}
