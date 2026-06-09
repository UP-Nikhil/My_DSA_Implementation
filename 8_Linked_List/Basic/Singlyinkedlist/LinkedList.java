class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class LinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    // insert in first
    void inserthead(int val) {
        Node temp = new Node(val);
        if (temp == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;

        }
        size++;
    }

    // insert in last;
    void insertlast(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }

        tail = temp;
        size++;
    }

    // insert in any position
    void insertAt(int index, int val) {
        Node t = new Node(val); 
        Node temp = head;
        if (index > size) {
            System.out.println(" over size index ");
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
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        size++;
    }

    // deletion function
    void deleteAt(int index) {
        if ( index == 0){
            head= head.next;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail= temp;
        size--;
    }

    void display() {
        Node temp = head;
        if (head == null) {
            System.out.println(" Emhpty List ! ");
            return;
        }

        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
            if(temp == null)
            {
                System.out.println();
                return;
            }
            System.out.print(" -> ");
        }
    }

    // get value index
    int getAt(int index) {
        Node temp = head;
        if (index < 0 || index > size) {
            System.out.print(" worng index : " + "");
            return index;
        }
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertlast(5);
        list.insertlast(10);
        list.insertlast(15);
        list.inserthead(2);  
        list.insertAt(0, 1);
        list.insertAt(5, 20);
        list.display();
        System.out.println(list.head.value);
        System.out.println(list.tail.value);
        list.insertAt(10, 30);
        System.out.println(list.getAt(10));
        list.deleteAt(2);
        list.display(); 
        list.deleteAt(0);
        list.display();
        System.out.println(list.head.value);
        System.out.println(list.size);

    }
}    