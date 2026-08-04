

public class base {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    // display 
   public static void display(Node root){
    if(root== null) return;
    System.out.print(root.val+" ->");
    if(root.left != null)  System.out.print(root.left.val+",");
    if(root.right != null)System.out.print(root.right.val);
    System.out.println();
    display(root.left);
    display(root.right);
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

        // display 
        display(root);
    }
    
}
