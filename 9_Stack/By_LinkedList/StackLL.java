class Stack {
    Node head = null;
    Node tail = null;
    int top = -1;

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

    void push(int val) {
        Node temp = new Node(val);
    
            temp.next = head;
            head = temp;
            top++;
    }

    int pop() {
        if (head == null) {
            System.out.println(" Stack is empaty !");
            return -1;
        } else {
            int val = head.value;
            head = head.next;
            System.out.println("pop("+val+") Sucessfull.");
            return val;
        }
    }

    void peek() {
        if (head == null) {
            System.out.println("Stack is empaty !");
            return;
        } else {
            System.out.println("Peek value : "+head.value);
        }
    }

    void display() {
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.value);
            temp= temp.next;
        }

    }
    int size(){
        return top;
    }
}

public class StackLL {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.display();
        st.peek();
        st.pop();
        st.display();
        st.peek();
        st.size();
    }
}
   