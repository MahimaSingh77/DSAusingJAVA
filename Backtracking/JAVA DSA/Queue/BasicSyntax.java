/*Queue */
import java.util.LinkedList;
import  java.util.Queue;
public  class BasicSyntax {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);         // [1,2,3,4,5]
        q.remove();                     
        System.out.println(q);          //[2,3,4,5]
        q.poll();   //same as remove
        System.out.println(q);          //[3,4,5]
        System.out.println(q.peek());  //3
        System.out.println(q.element());  //same as peek // 3
        System.out.println(q.size());  //4
        System.out.println(q.isEmpty());



        
    
    }
}