class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLL {

    Node head = null;
    Node tail = null;
    int size = 0;

    // Insert at beginning
    void inserthead(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    // Insert at end
    void insertlast(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    // Insert at given index
    void insertAt(int index, int value) {

        if (index < 0 || index > size) {
            System.out.println("Invalid Index!");
            return;
        }

        if (index == 0) {
            inserthead(value);
            return;
        }

        if (index == size) {
            insertlast(value);
            return;
        }

        Node t = new Node(value);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        t.next = temp.next;
        t.prev = temp;

        temp.next.prev = t;
        temp.next = t;

        size++;
    }

    // deletion
    void deleteHead() {
        if (size == 0) {
            System.out.println(" Linkedlist is empty ! ");
            return;
        }
        Node temp = head;
        head = temp.next;
        head.prev = null;
        size--;

    }

    void deleteLast() {
        if (size == 0) {
            System.out.println(" Linkedlist is empty ! ");
            return;
        }
        Node temp = tail;
        tail = temp.prev;
        tail.next = null;
        size--;
    }

    // delete in specific position;
    void deleteAt(int index) {
        if (size == 0) {
            System.out.println(" Linkedlist is empty ! ");
            return;
        }
        Node temp= head;
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        size--;

    }

    // Display forward
    void display() {
        if (head == null) {
            System.out.println("Empty List!");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value);

            if (temp.next != null) {
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    // Display reverse
    void displayrev() {
        if (tail == null) {
            System.out.println("Empty List!");
            return;
        }

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.value);

            if (temp.prev != null) {
                System.out.print(" <-> ");
            }

            temp = temp.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DoubleLL list = new DoubleLL();

        list.insertlast(12);
        list.insertlast(14);
        list.insertlast(16);

        System.out.println("Original List:");
        list.display();

        System.out.println("Reverse:");
        list.displayrev();

        list.inserthead(10);

        System.out.println("\nAfter inserthead(10):");
        list.display();

        list.insertAt(3, 8);

        System.out.println("\nAfter insertAt(3, 8):");
        list.display();

        System.out.println("Reverse:");
        list.displayrev();
        System.out.println("After deletion the list :");
        // list.deleteHead();
        // list.deleteLast();
        list.deleteAt(3);
        list.display();

        System.out.println("\nHead = " + list.head.value);
        System.out.println("Tail = " + list.tail.value);
        System.out.println("Size = " + list.size);
    }
}