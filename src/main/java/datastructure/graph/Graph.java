package main.java.datastructure.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
    private long numberOfNodes;
    private HashMap<Integer, List<Integer>> adjacentList;

    public Graph() {
        this.numberOfNodes = 0;
        this.adjacentList = null;
    }

    public void addVertex(Integer node) {
        if (adjacentList == null) {
            adjacentList = new HashMap<>();
            List<Integer> connections = new ArrayList<>();
            adjacentList.put(node, connections);
        } else {
            if (!adjacentList.containsKey(node)) {
                adjacentList.put(node, new ArrayList<>());
            } else {
                throw new RuntimeException("Vertex already exists");
            }
        }
        numberOfNodes++;
    }

    public void addEdge(Integer node1, Integer node2) {
        //undirected graph
        if (adjacentList == null) {
            addVertex(node1);
            addVertex(node2);
            adjacentList.get(node1).add(node2);
            adjacentList.get(node2).add(node1);
            numberOfNodes = numberOfNodes + 2;
        } else if (node1 != null && node2 != null) {
            if (adjacentList.containsKey(node1) && adjacentList.containsKey(node2)) {
                //both node exists -> add the edge
                adjacentList.get(node1).add(node2);
                adjacentList.get(node2).add(node1);
            } else if (adjacentList.containsKey(node1) && !adjacentList.containsKey(node2)) {
                //node 1 exists, but node 2 is new node
                //create new node2 vertex and link the nodes
                addVertex(node2);
                numberOfNodes++;
                adjacentList.get(node1).add(node2);
                adjacentList.get(node2).add(node1);
            } else if (adjacentList.containsKey(node2) && !adjacentList.containsKey(node1)) {
                //opposite of previous case
                addVertex(node1);
                numberOfNodes++;
                adjacentList.get(node2).add(node1);
                adjacentList.get(node1).add(node2);
            } else if (!adjacentList.containsKey(node1) && !adjacentList.containsKey(node2)) {
                throw new RuntimeException("Both the node values have no link to any pre existing nodes");
            }
        }
    }

    public void showConnections() {
        adjacentList.keySet().forEach(node -> {
            StringBuilder connections = new StringBuilder(" ");
            adjacentList.get(node).forEach(vertex -> connections.append(vertex).append(" "));
            System.out.println(node + "-->" + connections);
        });
    }

}
