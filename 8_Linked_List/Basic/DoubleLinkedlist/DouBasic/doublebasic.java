
public class doublebasic {
    public static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }
    public static Node insertAthead( Node head, int value){
        Node t= new Node(value);
        t.next= head;
        head.prev= t;
        head= t;
        return head;
    }
    public static void display(Node head) {
        Node temp = head;
        if (head == null) {
            System.out.println(" Emhpty List ! ");
            return;
        }

        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
            if (temp == null) {
                System.out.println();
                return;
            }
            System.out.print(" -> ");
        }
    }

    // reverse display
    public static void displayrev(Node tail) {
        Node temp = tail;
        if (tail == null) {
            System.out.println(" Emhpty List ! ");
            return;
        }

        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.prev;
            if (temp == null) {
                System.out.println();
                return;
            }
            System.out.print(" -> ");
        }
    }

    // display thirs function ; if any random node are given;
    public static void displayRDM(Node random) {
        Node temp = random;
        if (random == null) {
            System.out.println(" Emhpty List ! ");
            return;
        }
        while (temp.prev != null) {
            temp = temp.prev;
        }

        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
            if (temp == null) {
                System.out.println();
                return;
            }
            System.out.print(" -> ");
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        a.next = b; // head me prev me null hoata hai ;
        b.prev = a; // store a address;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        displayrev(e);
        displayRDM(c);
        Node newhead= insertAthead(a, 30);
        display(newhead);

    }
}
