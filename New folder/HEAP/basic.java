import java.util.PriorityQueue;

public class basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(8);
        System.out.println(pq+" "+pq.peek());
        pq.add(5);
        System.out.println(pq+" "+pq.peek());
        pq.add(11);
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
        System.out.println(pq.size());
    }
}
