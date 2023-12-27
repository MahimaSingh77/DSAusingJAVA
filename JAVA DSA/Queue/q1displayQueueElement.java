
/*Print all the element present only using add() , remove() , peek() & extra queue.
 */
import java.util.*;

public class q1displayQueueElement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Queue<Integer> temp = new LinkedList<>();
        while (q.isEmpty() == false) {
            
            int a = q.remove();
            System.out.print(a + " ");
            temp.add(a);
        }
        System.out.println(q);
        while(temp.isEmpty() == false){
            q.add(temp.poll());
        }
        System.out.println(q);
       
    }
}


