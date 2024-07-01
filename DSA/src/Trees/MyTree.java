package Trees;

import java.util.ArrayList;

public class MyTree {
    public Node root;
    int searchedKey = -1;

    public MyTree() {
        root = null;
    }

    public void insert(int data) {
        ArrayList<Integer> nodesVisited = new ArrayList<>();
        root = insertRecursive(root, data, nodesVisited);
        System.out.println("Nodes visited: " + nodesVisited);
    }

    private Node insertRecursive(Node node, int data, ArrayList<Integer> nodesVisited) {
        if (node == null) {
            System.out.println("Inserting " + data);
            return new Node(data);
        }

        nodesVisited.add(node.data);

        if (data < node.data) {
            node.lChild = insertRecursive(node.lChild, data, nodesVisited);
        } else {
            node.rChild = insertRecursive(node.rChild, data, nodesVisited);
        }
        return node;
    }

    /**
     * Finds a node in the binary search tree with the given data.
     *
     * @param  data the data to search for
     * @return      the node with the given data, or null if not found
     */
    public Node find(int data) {
        searchedKey = data;
        Node current = root;
        if (current == null) {
            System.out.println("No root node");
            return null;
        }
        while (current.data != data) {
            if (data < current.data) {
                current = current.lChild;
            } else {
                current = current.rChild;
            }
            if (current == null) {
                System.out.println("Node not found");
                return null;
            }
        }
        return current;
    }

    void printTree() {
        printTreeRec(root, 0, "");
    }

    void printTreeRec(Node node, int level, String prefix) {
        if (node != null) {
            printTreeRec(node.rChild, level + 2, prefix + "    ");
            String nodeLabel = node.data == searchedKey ? node.data + "(searched node)" : String.valueOf(node.data);
            System.out.println(prefix + (level > 0 ? "├── " : "") + nodeLabel);
            printTreeRec(node.lChild, level + 1, prefix + (level > 0 ? "│   " : "    "));
        }
    }

    public void in_order_traversal(Node root){
        if(root!=null){
            in_order_traversal(root.lChild);
            System.out.print(root.data+" ");
            in_order_traversal(root.rChild);
        }
        
    }

    public void post_order_traversal(Node root){
        if(root!=null){
            post_order_traversal(root.lChild);
            post_order_traversal(root.rChild);
            System.out.print(root.data+" ");
            
        }
        
    }

    public void pre_order_traversal(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            pre_order_traversal(root.lChild);
            pre_order_traversal(root.rChild);
        }
        
    }

    public void delete(int data){
        root=deleteRecursive(root, data);
    }

    /**
     * Delete a node with the given data recursively from the binary search tree.
     *
     * @param  root the root node of the binary search tree
     * @param  data the data to be deleted
     * @return      the root node of the modified binary search tree after deletion
     */
    public Node deleteRecursive(Node root, int data){
        if(root==null){
            return root;
        }

        if(data<root.data){
            root.lChild=deleteRecursive(root.lChild, data);
        }else if(data>root.data){
            root.rChild=deleteRecursive(root.rChild, data);
        }else{
            // Case 1: Node with only 1 child or no children
            // We replace the node with its right child or left child
            if(root.lChild==null){
                return root.rChild;
            }else if(root.rChild==null){
                return root.lChild;
            }
            // Case 2: Node with 2 children
            // Find the in order successor(smallest in the right subtree)
            root.data=maximumValue(root.rChild).data;

            // Delete the in order successor from the tree
            root.rChild=deleteRecursive(root.rChild, root.data);
        }
        return root;
    }

    public Node maximumValue(Node root){
        Node current=root;
        if(current==null){
            return null;
        }
        while(root.rChild!=null){
            current=root.rChild;
        }
        return current;
    }

    public Node minimumValue(Node root){
        Node current=root;
        if(current==null){
            return null;
        }
        while(root.lChild!=null){
            current=root.lChild;
        }
        return current;
    }

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.insert(48);
        myTree.insert(31);
        myTree.insert(34);
        myTree.insert(20);
        myTree.insert(78);
        myTree.insert(54);
        myTree.insert(50);
        myTree.insert(92);

        myTree.printTree();
        Node root=myTree.find(48);
        myTree.in_order_traversal(root);
        System.out.println();
        myTree.post_order_traversal(root);
        System.out.println();
        myTree.pre_order_traversal(root);
        System.out.println();  

        myTree.find(50);
        myTree.printTree();
    }


    
}

