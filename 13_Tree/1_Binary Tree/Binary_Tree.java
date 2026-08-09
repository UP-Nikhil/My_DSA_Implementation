import java.util.*;

public class Binary_Tree {

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

    public void pupulate(Scanner scanner) {

        System.out.println("Enter the root Node:");

        int value = scanner.nextInt();

        root = new Node(value);

        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {

        System.out.println("Do you want to enter left of " + node.val);

        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value of the left of " + node.val);

            int value = scanner.nextInt();

            node.left = new Node(value);

            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.val);

        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the value of the right of " + node.val);

            int value = scanner.nextInt();

            node.right = new Node(value);

            populate(scanner, node.right);
        }
    }

    public void display(Node root) {
        display(root, "");
    }

    private void display(Node root, String s) {

        // Base case
        if (root == null) return;

        System.out.println(s + root.val);

        display(root.left, s + "\t");
        display(root.right, s + "\t");
    }

    public static void main(String[] args) {

        Binary_Tree tree = new Binary_Tree();

        Scanner scanner = new Scanner(System.in);

        tree.pupulate(scanner);

        System.out.println("\nBinary Tree:");

        tree.display(tree.root);
    }
}