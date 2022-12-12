package main.java.datastructure.binarysearchtree;

/*
  Tree

        9
      /     \
     4     20
    / \     /  \
  1   6   15  170

 */
public class BSTMainClass {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);
        //System.out.println(bst);
        bst.lookup(170);
        bst.lookup(4);
        //bst.inorder();
        System.out.println("|*************** BFS Iterative ****************************|");
        bst.breadthFirstSearch();
        System.out.println("|*************** BFS Recursion ****************************|");
        bst.bfsRecursionTrigger();
        System.out.println("|*************** DFS in order ****************************|");
        bst.DFSInOrder();
        System.out.println("|*************** DFS Pre order ****************************|");
        bst.DFSPreOrder();

    }
}
