public class Diameter {
    private static int diameter = 0; // To store the maximum diameter found

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        PreOrder(a);
        System.out.println();
        InOrder(a);
        System.out.println();
        PostOrder(a);
        System.out.println();

        // Calculate the diameter
        calculateDiameter(a);
        System.out.println("Diameter of the tree: " + diameter);
    }

    public static int calculateDiameter(Node root) {
        if (root == null) {
            return 0; // Base case: height of null node is 0
        }

        // Recursively calculate the height of left and right subtrees
        int leftHeight = calculateDiameter(root.left);
        int rightHeight = calculateDiameter(root.right);

        // Update the maximum diameter found
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return the height of the current node
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void PreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.val + " ");
        InOrder(root.right);
    }

    public static void PostOrder(Node root) {
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.val + " ");
    }
}