class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class Diameter {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        PreOrder(a);
        System.out.println();
        InOrder(a);
        System.out.println();
        PostOrder(a);
        System.out.println();

       if(a==null) System.out.println(0);
       System.out.println(Diam(a.left)+Diam(a.right));


    }


    public static int Diam(Node root){
       return 1 + Math.max(Diam(root.left), Diam(root.right));

    }
    public static void PreOrder(Node Root){
        if(Root == null){
            return ;
        }
        System.out.print(Root.val+" ");
        PreOrder(Root.left);
        PreOrder(Root.right);
    }
    public static void InOrder(Node Root){
        if(Root == null){
            return ;
        }
        InOrder(Root.left);
        System.out.print(Root.val+" ");
        InOrder(Root.right);
    }
    public static void PostOrder(Node Root){
        if(Root == null){
            return ;
        }
        PostOrder(Root.left);
        PostOrder(Root.right);
        System.out.print(Root.val+" ");
    }
}
