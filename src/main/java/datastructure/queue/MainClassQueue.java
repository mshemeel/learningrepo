package main.java.datastructure.queue;

public class MainClassQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.printQueue();
        System.out.println("Peek->"+q.peek());
        System.out.println("Deque->"+q.dequeue());
        q.printQueue();
        System.out.println("Deque->"+q.dequeue());
        System.out.println("Deque->"+q.dequeue());
        System.out.println("Deque->"+q.dequeue());
        System.out.println("Deque->"+q.dequeue());
        System.out.println("Deque->"+q.dequeue());
        q.printQueue();

    }
}
