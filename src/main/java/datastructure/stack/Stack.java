package main.java.datastructure.stack;

import main.java.datastructure.linkedlist.Node;

public class Stack {
    private static final RuntimeException EMPTY_STACK = new RuntimeException("Empty Stack");
    private Node top;
    private Node bottom;
    private long length;

    public Stack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public int peek() {
        if (top == null) {
            throw EMPTY_STACK;
        }
        return top.getData();
    }

    public void push(int value) {
        Node newNode = new Node(value, null, null);
        length++;
        if (top == null) {
            //Adding to Empty stack
            top = newNode;
            bottom = top;
        } else {
            Node currentTopNode = top;
            currentTopNode.setPrevious(newNode);
            newNode.setNext(currentTopNode);
            top = newNode;
        }
    }

    public int pop() {
        Node toPop = top;
        Node newTop = null;
        if (toPop == null) {
            throw EMPTY_STACK;
        }
        if (this.top == this.bottom) {
            this.bottom = null;
        }else{
            newTop = top.getNext();
            newTop.setPrevious(null); //setting null previous
        }
        top = newTop;
        length--;
        return toPop.getData();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", bottom=" + bottom +
                ", length=" + length +
                '}';
    }

    public void printStack() {
        StringBuilder stack = new StringBuilder("TOP-->BOTTOM :");
        Node temp;
        try {
            temp = (Node) top.clone(); //cannot use original 'top' variable
        } catch (CloneNotSupportedException exp) {
            throw new RuntimeException("CloneNotSupported on Node");
        }
        stack.append(temp.getData());
        while (temp != null) {
            if (temp.getNext() != null)
                stack.append("-->").append(temp.getNext().getData());
            temp = temp.getNext();
        }
        System.out.println(stack);
    }

    public long getLength(){
        return this.length;
    }
}
