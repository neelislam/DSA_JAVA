import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
// higher priority will serve first
/*
        //Normal queue
        Queue<Double> queue = new LinkedList<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll()); //to display one by one

        }
*/
        //Priority queue (Kind of sorting)
        Queue<Double> queue = new PriorityQueue<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll()); //to display one by one
        }
System.out.println("\nDescending Order");
        Queue<Double> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue1.offer(3.0);
        queue1.offer(2.5);
        queue1.offer(4.0);
        queue1.offer(1.5);
        queue1.offer(2.0);

        while(!queue1.isEmpty()) {
            System.out.println(queue1.poll()); //to display one by one
        }
        System.out.println("\nString Order Descending");
        Queue<String> queue2 = new PriorityQueue<>(Collections.reverseOrder());
        queue2.offer("A");
        queue2.offer("C");
        queue2.offer("E");
        queue2.offer("B");
        queue2.offer("F");

        while(!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }

    }
}