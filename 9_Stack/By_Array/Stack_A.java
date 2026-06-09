class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push operation
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
    }

    // Pop operation
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    // Peek operation
    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Stack_A {
    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display(); 

        System.out.println("Top Element: " + st.peek());

        System.out.println("Popped: " + st.pop()); 

        st.display();

        System.out.println("Is Empty: " + st.isEmpty());
    }
}
 