import java.util.Scanner;

public class Binary_Search_Tree {

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    // Insert a value into BST
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {

        // If position is empty, create new node
        if (node == null) {
            return new Node(value);
        }

        // Smaller value -> left
        if (value < node.val) {
            node.left = insert(node.left, value);
        }

        // Greater value -> right
        else if (value > node.val) {
            node.right = insert(node.right, value);
        }

        // Duplicate value -> ignore
        else {
            System.out.println("Duplicate value: " + value);
        }

        return node;
    }

    // Search
    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node node, int value) {

        if (node == null) {
            return false;
        }

        if (node.val == value) {
            return true;
        }

        if (value < node.val) {
            return search(node.left, value);
        }

        return search(node.right, value);
    }

    // Inorder traversal
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {

        if (node == null) {
            return;
        }

        inorder(node.left);

        System.out.print(node.val + " ");

        inorder(node.right);
    }

    // Display tree
    public void display() {
        display(root, "");
    }

    private void display(Node node, String space) {

        if (node == null) {
            return;
        }

        System.out.println(space + node.val);

        display(node.left, space + "\t");
        display(node.right, space + "\t");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Binary_Search_Tree tree = new Binary_Search_Tree();

        System.out.print("How many values do you want to insert? ");
        int n = scanner.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }

        System.out.println("\nBST:");
        tree.display();

        System.out.println("\nInorder Traversal:");
        tree.inorder();

        System.out.print("\nEnter value to search: ");
        int value = scanner.nextInt();

        if (tree.search(value)) {
            System.out.println(value + " exists in BST.");
        } else {
            System.out.println(value + " does not exist in BST.");
        }

        scanner.close();
    }
}