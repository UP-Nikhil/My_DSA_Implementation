import java.util.LinkedList;
import java.util.Queue;
public class BFS_DFS {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
    // preorder, postorder and inorder traversal are a type of DFS;

    // preorder traversal (DLR); type of DFS
    static void preorer(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorer(root.left);
        preorer(root.right);
    }

    // Inorder traversal (LDR) type of DFS
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Postorder traversal (LRD) type of DFS
    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // find the hieght of tree
    static int hiegth(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(hiegth(root.left), hiegth(root.right));
    }

    // Level ordre traversal BFS
    static void BFS(Node root, int n) {
        if (root == null)
            return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        BFS(root.left, n - 1);
        BFS(root.right, n - 1);
    }

    // using queue BFS

    static void BFS_Q(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);
        while (q.size() > 0) {
            Node temp = q.peek();

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);

            System.out.print(temp.val + " ");
            q.remove();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1); // root node ;

        // Prent Node
        Node a = new Node(2);
        Node b = new Node(3);

        // connection bt root node and parrent node;
        root.left = a;
        root.right = b;

        // chield node;
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);

        // connection bt chieldt node and parrent node;
        // parrent a chield are c and d;
        a.left = c;
        a.right = d;
        // parrent b chield are e and f;
        b.left = e;
        b.right = f;

        // int level = hiegth(root) + 1;
        // for (int i = 1; i <= level; i++) {
        //     BFS(root, i);
        //     System.out.println();
        // }

        BFS_Q(root);
    }

}
