
class Mylist {

    private Node head;
    private Node tail;
    private int size;

    public Mylist() {
        this.size = 0;
    }

    private class Node {
        private Node head;
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // singly list insert element;
    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // insert the last position;
    public void insertlast(int val) {
        if (tail == null) {
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // insert in specifi position;
    public void insert(int val, int index) {
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
    }

    // deletion;
    public int deletefirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return val;
    }

    // deletion in last position;
    public int deleteLast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }
    
    // delete in specipic positon ;
    public int delete(int index ){
        if ( index == 0){
            return deletefirst();
        }
        if( index ==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
            int val= prev.next.value;
            prev.next= prev.next.next;
            return val;
        
    }
    // travers;
    public Node get(int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {  
            node = node.next;
        }
        return node;
    }

    // dispaly;
    public void display() {
        Node temp = head;
        if ( temp == null){
            System.out.println( "Empty Linkedlist");
            return;
        }
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(" End ");
    }
}

public class linked_list {
    public static void main(String[] args) {
        Mylist list = new Mylist();
        list.insertfirst(87);
        list.insertfirst(11);
        list.insertfirst(15);
        list.insertfirst(20);
        list.insertfirst(35);
        list.insertlast(98);
        list.insert(45, 4);
        list.display();
        System.out.println(list.deletefirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(3));
        list.display();
        
    }
}
