import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(655);
        pq.offer(6);
        pq.offer(76);

        System.out.println(pq);   // min heap is used  (smallest element will be at first)

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());

        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        pq2.offer(23);
        pq2.offer(655);
        pq2.offer(6);
        pq2.offer(76);

        System.out.println(pq2);  //now max heap is used...(biggest elemeng will be at first)

        
    }
}
