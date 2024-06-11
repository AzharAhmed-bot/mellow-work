import javax.xml.crypto.Data;

;

public class BST {

    BSTNode root;
    int searchedKey = -1;  // to store the key being searched

    public BST() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    BSTNode insertRec(BSTNode node, int key) {
        if (node == null) {
            return new BSTNode(key);
        }
        if (key < node.key) {
            node.left = insertRec(node.left, key);
        } else if (key > node.key) {
            node.right = insertRec(node.right, key);
        }
        return node;
    }

    boolean search(int key) {
        searchedKey = key;
        return searchRec(root, key);
    }

    boolean searchRec(BSTNode node, int key) {
        if (node == null) {
            return false;
        } else if (key == node.key) {
            return true;
        }
        if (key < node.key) {
            return searchRec(node.left, key);
        } else {
            return searchRec(node.right, key);
        }
    }

    void delete(int data){
        if(root==null){
            System.out.println("The tree the empty");
        }
        else if(search(data)==false){
            System.out.println("The key is not present in the tree");
        }
        else{
            root=deleteRec(root,data);
            System.out.println(data+" is deleted from the tree");
        }
    }

    BSTNode deleteRec(BSTNode node, int data){
        if(node==null){
            return node;
        }
        // If data is less than the node on the right, we go on recursion on the left
        if(data < node.key){
            node.left=deleteRec(node.left,data);
        }
        // Vice versa
        else if(data > node.key){
            node.right=deleteRec(node.right,data);
        }
        else{
            // If we reach the leaf node
            if(node.left==null && node.right==null){
                node=null;
            }
            // If it has a node but only one node:
            // The node we delete is on the right
            else if(node.left==null){
                BSTNode temp=node;
                node=node.right;
                temp=null;
            }
            else if(node.right==null){
                BSTNode temp=node;
                node=node.left;
                temp=null;
            }
            // If the node has 2 children, find the inorder successor (the smallest node in the right subtree) 
            else{
                BSTNode temp = minValueNode(node.right);
                node.key = temp.key;
                node.right = deleteRec(node.right, temp.key);

            }
        }
        return node;
    }


    
    BSTNode minValueNode(BSTNode node) {
        BSTNode current = node;

        // Loop down to find the leftmost node
        while (current.left!= null) {
            current = current.left;
        }

        // Return the leftmost node
        return current;
    }

    public int countNodes(){
        return countNodesRec(root);
    }

    public int countNodesRec(BSTNode root){
        if(root==null){
            return 0;
        }
        else{
            int num=1;
            num+=countNodesRec(root.right);
            num+=countNodesRec(root.left);
            return num;
        }
    }



    void printTree() {
        printTreeRec(root, 0, "");
    }

    void printTreeRec(BSTNode node, int level, String prefix) {
        if (node != null) {
            printTreeRec(node.right, level + 2, prefix + "   ");
            String nodeLabel = node.key == searchedKey ? node.key + "(searched node)" : String.valueOf(node.key);
            System.out.println(prefix + (level > 0 ? "├──" : "") + nodeLabel);
            printTreeRec(node.left, level + 1, prefix + (level > 0 ? "│  " : "   "));
        }
    }

    public static void main(String[] args) {
        BST myTree = new BST();
        myTree.insert(50);
        myTree.insert(30);
        myTree.insert(20);
        myTree.insert(40);
        myTree.insert(70);
        myTree.insert(60);
        myTree.insert(80);
        
        System.out.println("Tree before search:");
        myTree.printTree();
        
        // myTree.search(20);
        
        System.out.println("\nTree after delete:");
        // myTree.printTree();
        myTree.delete(20);
        myTree.delete(80);
        myTree.printTree();
        System.out.println(myTree.countNodes());
    }
}


