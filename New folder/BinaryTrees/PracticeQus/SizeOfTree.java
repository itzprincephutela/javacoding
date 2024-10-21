class Node{
    int val;
    Node right;
    Node left;
    Node(int val){
        this.val=val;
    }
}
public class SizeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(10);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f; 
        //System.out.println(Product(a));
        //System.out.println(MiniMum(a));
        System.out.println(Size(a));
    }

    public static int Size(Node root){
        if(root==null){
            return 0 ;
        }
        return 1 + Size(root.left) + Size(root.right);
        
       
    }

    public static int MiniMum(Node root){
        if(root ==null){
            return Integer.MAX_VALUE;
        }
        int leftmax =MiniMum(root.left);
        int Rightmax =MiniMum(root.right);

        return Math.min(root.val,Math.min(leftmax,Rightmax));
    }
    public static int Product(Node Root){
        if (Root == null || Root.val==0){
            return 1;
        }
        return Root.val * Product(Root.left) * Product(Root.right);

    }
}
