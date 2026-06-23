
public class basic_linkedlist {
    public static class Node {
        int data;
        Node next;

        // constructer
        Node(int data) {
            this.data = data;
        }

    }

    // function for display
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // recursion function
    public static void displayr(Node head) {
        if (head.next == null) {
            return;
        }
        System.out.println(head.data + " ");  
        displayr(head.next);
    }

    public static void main(String[] args) {
        // data 5,6,7,8,9;
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        // now create a diffrent likedlist where all data store in memory in diffrent
        // loaction
        // like this 5 6 7 8 9 store in memory without connected;
        System.out.println(b); // b ka address in memory -> basic_linkedlist$Node@1dbd16a6
        System.out.println(a.next); // output NULL

        // now connect
        a.next = b; // 5 -> 6;

        System.out.println(a.next); // b se connect hone k bad ; a k next me b ka memory address ->
                                    // basic_linkedlist$Node@1dbd16a

        b.next = c; // 5 -> 6 -> 7
        c.next = d; // 5 -> 6 -> 7 -> 8
        d.next = e; // 5 -> 6 -> 7 -> 8 -> 9
        // now display the data;
        System.out.println(a.data);
        System.out.println(a.next.data); // yani b
        System.out.println(a.next.next.data); // yani c
        System.out.println(a.next.next.next.data); // yani d
        System.out.println(a.next.next.next.next.data); // yani e

        System.out.println("\n");

        // now short form to display the data
        Node temp = a;
        for (int i = 0; i < 5; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        display(a);
    }
}
//[4,5,1,9]
