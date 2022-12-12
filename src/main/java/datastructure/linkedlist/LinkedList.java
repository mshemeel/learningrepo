package main.java.datastructure.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private long length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    /**
     * add at last
     **/
    public void append(int value) {
        //add to tail of linked list
        Node newNode = new Node(value, null, null);
        this.length++;
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * add at first
     **/
    public void prepend(int value) {
        Node newNode = new Node(value, null, null);
        this.length++;
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            head.setPrevious(newNode);
            newNode.setNext(head);
            head = newNode;
        }

    }

    /**
     * add at position
     **/
    public void insert(int pos, int value) {
        Node newNode = new Node(value, null, null);
        this.length++;
        System.out.println("inserted :" + value + " @ pos" + pos);
        if (head == null) {
            head = newNode;
            tail = head;
        } else if (pos == 0) {
            prepend(value);
        } else {
            //get the previous node to insert
            Node previousNode = traverseToIndex(pos - 1);
            Node temp = previousNode.getNext();
            previousNode.setNext(newNode);
            newNode.setPrevious(previousNode);
            newNode.setNext(temp);
        }
    }

    /**
     * delete first element -> pop
     **/
    public int pop() {
        Node firstNode = this.head;
        int value;
        if (firstNode == null) {
            throw new RuntimeException("No element to pop");
        } else {
            value = firstNode.getData();
            Node temp = firstNode.getNext();
            temp.setPrevious(null);
            this.head = temp;
        }
        this.length--;
        return value;
    }


    /**
     * delete at pos
     **/
    public void delete(int pos) {
        if (pos == 0) {
            pop();//delete the head element
        } else {
            Node previousNode = traverseToIndex(pos - 1);//previous position
            Node toDelete = previousNode.getNext();
            System.out.println("deleted->" + toDelete.getData());
            Node temp = toDelete.getNext();
            temp.setPrevious(previousNode);
            previousNode.setNext(temp);
        }
        this.length--;

    }

    private Node traverseToIndex(int index) {
        Node currentNode = this.head;
        int counter = 0;
        while (index != counter) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return currentNode;
    }

    public void reverse() {
        if (head == null) {
            throw new RuntimeException("No items in linked list");
        }
        Node previous = null;
        Node current = head;
        this.tail = current;
        while (current != null) {
            Node nextElement = current.getNext();
            current.setNext(previous);
            current.setPrevious(nextElement);
            previous = current;
            current = nextElement;
        }
        this.head = previous;
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head.getData() +
                ", tail=" + tail.getData() +
                ", length=" + length +
                '}';
    }
}
