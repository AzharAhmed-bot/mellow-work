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
        
        myTree.search(20);
        
        System.out.println("\nTree after search:");
        myTree.printTree();
    }
}


