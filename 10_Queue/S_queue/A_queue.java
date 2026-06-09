class Queue {

    int front;
    int rear;
    int size;
    int[] arr;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void add(int val) {

        if (rear == size - 1) {
            System.out.println("Queue Overflow!");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        arr[++rear] = val;
    }

    int remove() {

        if (front == -1) {
            System.out.println("Queue Underflow!");
            return -1;
        }

        int value = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }

        return value;
    }

    int peek() {

        if (front == -1) {
            System.out.println("Queue Empty!");
            return -1;
        }

        return arr[front];
    }

    void display() {

        if (front == -1) {
            System.out.println("Queue Empty!");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
public class A_queue {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.display();

        System.out.println("Front = " + q.peek());

        System.out.println("Removed = " + q.remove());
        q.display();
    }
}
