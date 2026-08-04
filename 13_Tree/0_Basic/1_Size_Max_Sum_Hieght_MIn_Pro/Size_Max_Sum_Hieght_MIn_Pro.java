
public class Size_Max_Sum_Hieght_MIn_Pro {
     static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    // preorder traversal;
    static void preorer(Node root){
        if(root == null) return; 
        System.out.print(root.val + " ");
        preorer(root.left);
        preorer(root.right);
    }

    // find size of tree;
    static int size(Node root){
        if(root == null) return 0;
        return 1+ size(root.left) +size(root.right);
    }
    // find sum of tree;
    static int sum(Node root){
        if(root == null) return 0;
        return root.val+ sum(root.left) +sum(root.right);
    }

    // find product of tree; 
    static int product(Node root){
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    // find max of tree 
    static int max (Node root){
        if(root == null )return Integer.MIN_VALUE;
        // int a = root.val;
        // int b = max(root.left);
        // int c = max(root.right);
        // return Math.max(a,Math.max(b, c));
        return Math.max(root.val, Math.max (max(root.left),  max(root.right) ));
    }
  
    // find min value;
    static int min(Node root){
        if(root ==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min (min(root.left),  min(root.right) ));
    }

    // find the hieght of tree 
    static int hiegth(Node root ){
        if(root== null || (root.left == null && root.right == null) ) return 0;
        return 1 + Math.max(hiegth(root.left),hiegth(root.right));
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
        // preorer(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(hiegth(root));
        System.out.println(min(root));
        System.out.println(product(root));

     }
    
}
