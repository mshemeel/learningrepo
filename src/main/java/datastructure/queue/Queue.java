package main.java.datastructure.queue;

import main.java.datastructure.linkedlist.Node;

public class Queue {
    private static final RuntimeException EMPTY_QUEUE = new RuntimeException("Queue is Empty");

    private Node first;
    private Node last;
    private long length;

    public long getLength() {
        return this.length;
    }

    public Queue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public int peek() {
        if (first == null) {
            throw EMPTY_QUEUE;
        }
        return first.getData();
    }

    public void enqueue(int value) {
        Node newNode = new Node(value, null, null);
        if (first == null) {
            first = newNode;
            last = first;
        } else {
            Node currentLast = this.last;
            newNode.setPrevious(currentLast);
            currentLast.setNext(newNode);
            last = newNode;
        }
        length++;
    }


    public int dequeue() {
        if (first == null) {
            throw EMPTY_QUEUE;
        }
        Node toRemove = first;
        Node newFirst = toRemove.getNext();
        first = newFirst;
        length--;
        return toRemove.getData();
    }

    public void printQueue() {
        StringBuilder stack = new StringBuilder("FIRST-->LAST :");
        if (first != null) {
            Node temp;
            try {
                temp = (Node) first.clone();
                stack.append(temp.getData());
            } catch (CloneNotSupportedException exp) {
                throw new RuntimeException("CloneNotSupported on Node");
            }

            while (temp != null) {
                if (temp.getNext() != null)
                    stack.append("-->").append(temp.getNext().getData());
                temp = temp.getNext();
            }
        }else {
            stack.append(" EMPTY");
        }

        System.out.println(stack);
    }

    @Override
    public String toString() {
        return "Queue{" +
                "first=" + first +
                ", last=" + last +
                ", length=" + length +
                '}';
    }
}
