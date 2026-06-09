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

public class DC_LL {

    Node head = null;
    Node tail = null;
    int size = 0;

    // Insert at beginning
    void inserthead(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
            head.next = head;
            head.prev = head;
        } else {
            temp.next = head;
            temp.prev = tail;

            head.prev = temp;
            tail.next = temp;

            head = temp;
        }
        size++;
    }

    // Insert at end
    void insertlast(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
            head.next = head;
            head.prev = head;
        } else {
            temp.prev = tail;
            temp.next = head;

            tail.next = temp;
            head.prev = temp;

            tail = temp;
        }
        size++;
    }

    // Insert at any index
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

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node t = new Node(value);

        t.next = temp.next;
        t.prev = temp;

        temp.next.prev = t;
        temp.next = t;

        size++;
    }

    // Delete head
    void deleteHead() {

        if (size == 0) {
            System.out.println("List is Empty!");
            return;
        }

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }

        size--;
    }

    // Delete tail
    void deleteLast() {

        if (size == 0) {
            System.out.println("List is Empty!");
            return;
        }

        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }

        size--;
    }

    // Delete at any index
    void deleteAt(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid Index!");
            return;
        }

        if (index == 0) {
            deleteHead();
            return;
        }

        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;

        size--;
    }

    // Display forward
    void display() {

        if (head == null) {
            System.out.println("Empty List!");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.value);

            temp = temp.next;

            if (temp != head) {
                System.out.print(" <-> ");
            }

        } while (temp != head);

        System.out.println();
    }

    // Display reverse
    void displayrev() {

        if (tail == null) {
            System.out.println("Empty List!");
            return;
        }

        Node temp = tail;

        do {
            System.out.print(temp.value);

            temp = temp.prev;

            if (temp != tail) {
                System.out.print(" <-> ");
            }

        } while (temp != tail);

        System.out.println();
    }

    public static void main(String[] args) {

        DC_LL list = new DC_LL();

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

        list.insertAt(2, 13);

        System.out.println("\nAfter insertAt(2,13):");
        list.display();

        list.deleteHead();

        System.out.println("\nAfter deleteHead():");
        list.display();

        list.deleteLast();

        System.out.println("\nAfter deleteLast():");
        list.display();

        list.deleteAt(1);

        System.out.println("\nAfter deleteAt(1):");
        list.display();

        System.out.println("\nHead = " + list.head.value);
        System.out.println("Tail = " + list.tail.value);
        System.out.println("Size = " + list.size);

        // Circularity Check
        System.out.println("\nhead.prev = " + list.head.prev.value);
        System.out.println("tail.next = " + list.tail.next.value);
    }
} 