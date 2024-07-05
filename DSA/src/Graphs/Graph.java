package Graphs;

import java.util.*;

public class Graph {
    public int MAX_VERTICES = 30;
    public Vertex[] vertexList;
    public MyLinkedList[] adjacencyList;
    public int count;
    public Stack<Integer> myStack;
    public Queue<Integer> myQueue;

    public Graph() {
        vertexList = new Vertex[MAX_VERTICES];
        adjacencyList = new MyLinkedList[MAX_VERTICES];
        count = 0;

        for (int i = 0; i < MAX_VERTICES; i++) {
            adjacencyList[i] = new MyLinkedList();
        }

        myStack = new Stack<>();
        myQueue = new LinkedList<>();
    }

    public void addVertex(char data) {
        vertexList[count++] = new Vertex(data);
    }

    public void addEdge(int start, int end) {
        adjacencyList[start].insertFirst(end);
        adjacencyList[end].insertFirst(start);
    }

    public void displayVertex(int arrayPosition) {
        System.out.print(vertexList[arrayPosition].data + " ");
    }

    public int getAdjUnvisitedVertex(int arrayPosition) {
        return adjacencyList[arrayPosition].findUnvisitedVertex(vertexList);
    }

    public void depthFirstSearch() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        myStack.push(0);

        while (!myStack.isEmpty()) {
            int v = getAdjUnvisitedVertex(myStack.peek());
            if (v == -1) {
                myStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                myStack.push(v);
            }
        }

        resetWasVisited();
    }

    public void breadthFirstSearch() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        myQueue.add(0);

        while (!myQueue.isEmpty()) {
            int v1 = myQueue.remove();
            int v2;

            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                myQueue.add(v2);
            }
        }

        resetWasVisited();
    }

    public void breadthFirstSearchForMST() {
        vertexList[0].wasVisited = true;
        myQueue.add(0);

        while (!myQueue.isEmpty()) {
            int v1 = myQueue.remove();
            int v2;
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v1);
                System.out.print("-->");
                displayVertex(v2);
                System.out.println();
                myQueue.add(v2);
            }
        }
        resetWasVisited();
    }

    public void resetWasVisited() {
        for (int i = 0; i < count; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addVertex('A'); // 0
        g.addVertex('B'); // 1
        g.addVertex('C'); // 2
        g.addVertex('D'); // 3
        g.addVertex('E'); // 4
        g.addVertex('F'); // 5
        g.addVertex('G'); // 6
        g.addVertex('H'); // 7
        g.addVertex('I'); // 8

        g.addEdge(0, 1); // A-B
        g.addEdge(0, 3); // A-D
        g.addEdge(1, 2); // B-C
        g.addEdge(1, 4); // B-E
        g.addEdge(2, 5); // C-F
        g.addEdge(3, 6); // D-G
        g.addEdge(4, 5); // E-F
        g.addEdge(4, 7); // E-H
        g.addEdge(5, 8); // F-I
        g.addEdge(6, 7); // G-H
        g.addEdge(7, 8); // H-I
        g.addEdge(3, 4); // D-E

        System.out.println("Breadth First Search For Minimum spanning tree:");
        g.breadthFirstSearchForMST();

        System.out.println("Depth First Search:");
        g.depthFirstSearch();
        System.out.println();

        System.out.println("Breadth First Search:");
        g.breadthFirstSearch();
        System.out.println();
    }
}
