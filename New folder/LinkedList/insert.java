
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size;
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
           temp= temp.next;
        }
        System.out.println();
    }
    void insertAtHead(int data){
        Node temp = new Node(data);
        if(this.head==null) head= tail =temp ;
        temp.next=head;
        head=temp;       
        size++;
    }
    void insertAtTail(int data){
        Node temp = new Node(data);
        if(this.head==null) head= tail =temp;
        tail.next=temp;
        tail=temp;
        size++;
    }
    void insert(int idx,int data){
        Node temp = new Node(data);
        Node x =head;
        if(idx==0){
               insertAtHead(data);
               return;
        }
        if(idx==size){
            insertAtTail(data);
            return;
        }
        if(idx>size){
            System.out.println("ERROR OUT OF BOUND ");
            return;

        }

       for(int i =1 ; i<=idx-1;i++){
        x=x.next;  
       }
       temp.next=x.next;
       x.next=temp;
       size++;
    }
}
public class insert {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(15);
        list.insertAtTail(20);
        list.display();
        list.insert(20, 1000);
        list.display();

    }
}
