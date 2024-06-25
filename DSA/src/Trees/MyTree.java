package Trees;

public class MyTree {
    public Node root;
    int searchedKey = -1;

    public MyTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    public Node insertRecursive(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data < node.getData()) {
                node.lChild = insertRecursive(node.lChild, data);
            } else {
                node.rChild = insertRecursive(node.rChild, data);
            }
        }
        return node;
    }

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
    public void delete(){
        
    }

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.insert(50);
        myTree.insert(30);
        myTree.insert(20);
        myTree.insert(40);
        myTree.insert(70);
        myTree.insert(60);
        myTree.insert(80);

        myTree.printTree();
        Node root=myTree.find(50);
        myTree.in_order_traversal(root);
        System.out.println();
        myTree.post_order_traversal(root);
        System.out.println();
        myTree.pre_order_traversal(root);
        System.out.println();
  
    
    }
}

