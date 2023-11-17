import java.util.*;
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12); //add at first 
        adq.offerLast(2);  //add at last till now
        adq.offer(6746);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());  
        System.out.println(adq.peekLast());   
        //remove the first element
        System.out.println(adq.poll());

        System.out.println(adq);


        //remove the last element
        System.out.println(adq.pollLast());

        System.out.println(adq);







    }
}
