import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Trees {
    public static void main(String[] args) {
        Node root = null;
        root = buildTree(root);
    }
    public static Node buildTree(Node root) {
     System.out.println("Enter data");
        Scanner sc = new Scanner(System.in);
        int data = -1;
        if (sc.hasNextInt()) {
            data = sc.nextInt();
            if (data == -1) {
                return null;
            }
        }
        root = new Node(data);

        // build left
        System.out.println("Enter Left data");
        root.left = buildTree(root.left);

        // build right
        System.out.println("Enter Right data");
        root.right = buildTree(root.right);

        return root;
    }

}
