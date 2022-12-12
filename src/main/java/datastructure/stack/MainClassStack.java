package main.java.datastructure.stack;

public class MainClassStack {
    public static void main(String[] arg) {
       Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
        System.out.println("Peek->" + stack.peek() + " Length->" + stack.getLength());
        System.out.println("Pop->" + stack.pop() + " Length->" + stack.getLength());
        stack.printStack();
        System.out.println("Pop->" + stack.pop() + " Length->" + stack.getLength());
        System.out.println("Pop->" + stack.pop() + " Length->" + stack.getLength());
        System.out.println("Pop->" + stack.pop() + " Length->" + stack.getLength());
    }
}
