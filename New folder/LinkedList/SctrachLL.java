class LinkedList{
    Node head;
    Node tail;
     int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null)head=tail=temp;
        tail.next=temp;
        tail=temp;
        size++;
    }
    void insertAtStart(int val){
        Node temp = new Node(val);
        if(head==null) head = tail =temp;
        temp.next=head;
        head=temp;
        size++;
    }
   void display(){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class SctrachLL {
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        System.out.println(ll.size);
        ll.insertAtStart(5);
        ll.insertAtStart(1);
         ll.display();
         ll.insertAtStart(0);
         ll.display();
         System.out.println(ll.size);
    }
}
