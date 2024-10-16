
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class basic {

    public static void display(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        display(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        display(a);
    }
}
