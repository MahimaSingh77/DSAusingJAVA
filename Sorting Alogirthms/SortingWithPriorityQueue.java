import java.util.PriorityQueue;

public class SortingWithPriorityQueue {
    public static void main(String[] args) {
        int[] arr = {10,9,7,11,12,13,15,8,3};

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++){
            priorityQueue.offer(arr[i]);
        }
         for(int i=0; i<arr.length; i++){
            System.out.println(priorityQueue.poll());
        }
    }
}
