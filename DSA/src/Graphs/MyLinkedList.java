package Graphs;

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public void insertFirst(int vertexId) {
        Node newNode = new Node(vertexId);
        newNode.next = head;
        head = newNode;
    }

    public int findUnvisitedVertex(Vertex[] vertexList) {
        Node current = head;
        while (current != null) {
            if (!vertexList[current.data].wasVisited) {
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }

    // Other methods as needed
}
