public class Tree_traversal {
     static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    // preorder traversal (DLR);
    static void preorer(Node root){
        if(root == null) return; 
        System.out.print(root.val + " ");
        preorer(root.left);
        preorer(root.right);
    }
    
    // Inorder traversal (LDR)
    static void inorder(Node root){
        if(root == null) return; 
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Postorder traversal (LRD)
     static void postorder(Node root){
        if(root == null) return; 
         postorder(root.left);
         postorder(root.right);
         System.out.print(root.val + " ");
    }

     public static void main(String[] args) {
        Node root = new Node(1); // root node ;

        // Prent Node 
        Node a= new Node(2);
        Node b= new Node(3);

        // connection bt root node and parrent node;
        root.left= a;
        root.right = b;

        // chield node;
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(6);
        Node f= new Node(7);
        
         // connection bt chieldt node and parrent node;
         // parrent a chield are c and d;
        a.left= c;
        a.right =d;
        // parrent b chield are e and f;
        b.left = e;
        b.right = f;

        preorer(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }

}
