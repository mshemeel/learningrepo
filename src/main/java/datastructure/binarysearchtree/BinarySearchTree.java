package main.java.datastructure.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
    private TreeNode root;
    private long size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }


    public void lookup(int value) {
        TreeNode currentNode = this.root;
        if (currentNode == null) {
            throw new RuntimeException("Empty Tree");
        }
        TreeNode resultNode = findPosition(currentNode, value);
        if (resultNode == null) {
            throw new RuntimeException("Element not found");
        } else {
            System.out.println("Found ->" + resultNode);
        }
    }

    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode currentNode = root;
            findPositionAndInsert(newNode, currentNode); //recursion
        }
        size++;
    }


    private void findPositionAndInsert(TreeNode newNode, TreeNode currentElement) {
        if (newNode.getValue() > currentElement.getValue()) {
            //move right
            if (currentElement.getRight() == null) {
                currentElement.setRight(newNode);
            } else {
                currentElement = currentElement.getRight();
                findPositionAndInsert(newNode, currentElement);
            }
        } else if (newNode.getValue() < currentElement.getValue()) {
            //move left
            if (currentElement.getLeft() == null) {
                currentElement.setLeft(newNode);
            } else {
                currentElement = currentElement.getLeft();
                findPositionAndInsert(newNode, currentElement);
            }
        }
    }


    private TreeNode findPosition(TreeNode currentNode, int value) {
        TreeNode resultNode = null;
        if (currentNode.getValue() == value) {
            resultNode = currentNode;
        } else {
            if (value > currentNode.getValue()) {
                //move right
                currentNode = currentNode.getRight();
            } else if (value < currentNode.getValue()) {
                //move left
                currentNode = currentNode.getLeft();
            }
            if (currentNode != null) {
                resultNode = findPosition(currentNode, value);
            }
        }
        return resultNode; // result = null if not found
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }

    public void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getValue());
            inorderRec(root.getRight());
        }
    }

    /**
     * BFS iterative
     **/
    public void breadthFirstSearch() {
        TreeNode currentNode = this.root;
        List<Integer> finalResult = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(currentNode); // add root node to queue
        while (!queue.isEmpty()) {
            currentNode = queue.poll(); //get the last element from queue and add to result
            finalResult.add(currentNode.getValue());
            // if current node has left -> add to queue
            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            // if current node has right -> add to queue
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
        finalResult.forEach(System.out::println);
    }

    public void bfsRecursionTrigger(){
        List<Integer> finalResult = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this.root);
        breadthFirstSearchRecursive(queue,finalResult);
        finalResult.forEach(System.out::println);
    }
    /**
     * BFS -> recursion
     **/
    private List<Integer> breadthFirstSearchRecursive(Queue<TreeNode> queue, List<Integer> finalResult) {
        if (queue.isEmpty()) {
            return finalResult;
        }
        TreeNode currentNode = queue.poll();
        finalResult.add(currentNode.getValue());
        // if current node has left -> add to queue
        if (currentNode.getLeft() != null) {
            queue.add(currentNode.getLeft());
        }
        // if current node has right -> add to queue
        if (currentNode.getRight() != null) {
            queue.add(currentNode.getRight());
        }
        return breadthFirstSearchRecursive(queue, finalResult);

    }

    /**DFS **/
    public void DFSInOrder(){
        List<Integer> finalResult = depthFirstSearchInOrder(this.root,new ArrayList<>());
        finalResult.forEach(System.out::println);
    }
    private List<Integer> depthFirstSearchInOrder(TreeNode node, List<Integer> finalResult){
        if (node.getLeft()!=null) {
            depthFirstSearchInOrder(node.getLeft(), finalResult);
        }
        finalResult.add(node.getValue());
        if (node.getRight()!=null) {
            depthFirstSearchInOrder(node.getRight(), finalResult);
        }
        return  finalResult;
    }

    public void DFSPreOrder(){
        List<Integer> finalResult = depthFirstSearchPreOrder(this.root,new ArrayList<>());
        finalResult.forEach(System.out::println);
    }

    private List<Integer> depthFirstSearchPreOrder(TreeNode node, ArrayList<Integer> finalResult) {
        System.out.println(node.getValue());
        finalResult.add(node.getValue());
        if (node.getLeft()!=null) {
            depthFirstSearchPreOrder(node.getLeft(), finalResult);
        }
        if (node.getRight()!=null) {
            depthFirstSearchPreOrder(node.getRight(), finalResult);
        }
        return  finalResult;
    }

}
