
/*insert at bottom/ any index */
import java.util.*;

public class q2insertAtAnyIndex {
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
        System.out.println("st stack is : " + st);

        System.out.print("Enter the index at which the element is to be entered : ");
        int idx = sc.nextInt();
        System.out.println("Enter the element to be added : ");
        int num = sc.nextInt();

        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            // int x = st.peek();
            // temp.push(x);
            // st.pop();
            temp.push(st.pop());

        }

        st.push(num);

        while (temp.size() > 0) {
            st.push(temp.pop());
        }

        System.out.println(st);

    }
}
