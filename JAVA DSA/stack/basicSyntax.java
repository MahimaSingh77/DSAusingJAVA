import java.util.Stack;
public class basicSyntax{
    public static void main(String[] args) {
        Stack<Integer>  st = new Stack<>();
        //push operation
        st.push(1);
        st.push(23);
        st.push(90);
        System.out.println(st);
     //peek()
        System.out.println("peek element is : " + st.peek());
    //pop() operation
    st.pop();
    System.out.println(st);
    //size()
    System.out.println("size is : " + st.size());
    //isEmpty
    System.out.println("Is stack empty : " + st.isEmpty());


    }
}