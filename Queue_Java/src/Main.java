import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        //fifo - first in first out
        // add == enqueue, offer()
        // remove == dequeue, poll()
        Queue<String> queue = new LinkedList<String>();
        System.out.println("Is queue Empty:"+queue.isEmpty());
        queue.offer("\nGoru");
        queue.offer("Mohish");
        queue.offer("Haati");
        queue.offer("Sagol");
        queue.offer("Khatash");
        queue.offer("PabdaMach");
        System.out.println("Size of queue is "+queue.size());
        System.out.println("Elements: " +queue);
        System.out.println("First element: " + queue.peek());
        System.out.println("Is Sagol there? ");
        System.out.println(queue.contains("Sagol"));
        System.out.println("Is MolaMach there? ");
        System.out.println(queue.contains("MolaMach"));
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();

        System.out.println(queue);

    }
}