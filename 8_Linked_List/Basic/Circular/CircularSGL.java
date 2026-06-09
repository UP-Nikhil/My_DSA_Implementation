class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next= next;
    }
}

public class CircularSGL {

    Node head = null;
    Node tail = null;
    int size = 0;

    // Insert at beginning
    void inserthead(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
            tail.next = head;
        } else {
            temp.next = head;
            head = temp;
            tail.next = head;
        }

        size++;
    }

    // Insert at end
    void insertlast(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
            tail.next = head;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }

        size++;
    }

    // Insert at any position
    void insertAt(int index, int val) {

        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            inserthead(val);
            return;
        }

        if (index == size) {
            insertlast(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node t = new Node(val);

        t.next = temp.next;
        temp.next = t;

        size++;
    }

    // Delete at index
    void deleteAt(int index) {

        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return;
        }

        // only one node
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }

        // delete head
        if (index == 0) {
            head = head.next;
            tail.next = head;
            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // deleting tail
        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        tail.next = head;

        size--;
    }

    // Display Circular List
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
                System.out.print(" -> ");
            }

        } while (temp != head);

        System.out.println();
    }

    // Get value at index
    int getAt(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.value;
    }

    public static void main(String[] args) {

        CircularSGL list = new CircularSGL();

        list.insertlast(5);
        list.insertlast(10);
        list.insertlast(15);

        list.inserthead(2);

        list.insertAt(0, 1);
        list.insertAt(5, 20);

        System.out.println("List:");
        list.display();

        System.out.println("Head = " + list.head.value);
        System.out.println("Tail = " + list.tail.value);

        System.out.println("tail.next = " + list.tail.next.value);

        System.out.println("Value at index 3 = " + list.getAt(3));

        list.deleteAt(2);

        System.out.println("After delete index 2:");
        list.display();

        list.deleteAt(0);

        System.out.println("After delete head:");
        list.display();

        System.out.println("Size = " + list.size);
    }
}