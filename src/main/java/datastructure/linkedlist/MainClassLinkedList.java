package main.java.datastructure.linkedlist;

public class MainClassLinkedList {
    public static void main(String[] arg){
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        System.out.println(list);
        list.prepend(4);
        list.prepend(5);
        list.prepend(6);
        System.out.println(list);
        list.insert(1,100);
        System.out.println(list);
        System.out.println("Popped ->" + list.pop());
        System.out.println(list);
        list.delete(2);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
    }
}
