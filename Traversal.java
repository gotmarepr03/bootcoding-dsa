class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class Traversal {

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println("inorder = " + root.data);
        inorder(root.right);

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println("Preorder = " + root.data);
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

        System.out.println("Inorder Traversal:-");
        inorder(n1);
        System.out.println("preorder Traversal:-");
        preorder(n1);
    }
}
