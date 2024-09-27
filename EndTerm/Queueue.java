import java.util.LinkedList;
import java.util.Queue;

public class Queueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue);
        queue.add(0);
        System.out.println(queue);
        queue.offer(1);
        System.out.println(queue);
        queue.peek();
        System.out.println(queue.element());
        queue.poll(); 
        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue);
    }
}
