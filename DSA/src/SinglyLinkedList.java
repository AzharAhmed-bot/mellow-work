// Visit the node.java to check out the node for the linked list


public class SinglyLinkedList {
    Node head;
    public SinglyLinkedList(int head){
        this.head = new Node(head);
    }

    // Create a new node with the given data and add it to the beginning of the list
    // 1. Create a new node with the given data
    // 2. Set the new node's next pointer to the current head
    // 3. Set the head to the new node
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head= newNode;
    }

    // Remove the first node from the list
    // 1. If the list is not empty, set the head to the next node
    public void removeFirst(){
        if(head!=null){
            head=head.next;
        }

    }

    // Add a new node with the given data to the end of the list
    // 1. If the list is empty, add the node to the beginning
    // 2. Traverse the list to find the last node
    // 3. Set the last node's next pointer to the new node
    public void addLast(int data){
        Node current=head;
        if(current==null){
            addFirst(data);
            return;
        }
        while(current.next!=null){
            current=current.next;
        }
        current.next=new Node(data);
    }

    // Remove the last node from the list
    // 1. If the list is empty, do nothing
    // 2. If the list has only one node, set the head to null
    // 3. Traverse the list to find the second-to-last node
    // 4. Set the second-to-last node's next pointer to null
    public void removeLast(){
        Node current=head;
        if(current==null){
            return;
        }
        if(current.next==null){
            head=null;
        }
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }

    // Delete the first occurrence of a node with the given key
    // 1. Traverse the list to find the node with the given key
    // 2. If found, update the previous node's next pointer to skip the current node
    // 3. Return true if the node was found and deleted, false otherwise
    public boolean delete(int key){
        Node current=head;
        Node previous=null;
        while(current!=null){
            if(current.data==key){
                previous.next=current.next;
                return true;
            }
            previous=current;
            current=current.next;
        }
        return false;
    }

    // Print the contents of the list
    // 1. Traverse the list and print each node's data
    // 2. Print "null" at the end to indicate the end of the list
    public void printList() {
        Node current = head;
        while (current!= null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(0); 
        list.addFirst(1); 
        list.addFirst(2);
        list.addFirst(3); 
        list.addLast(4);
        list.printList();
        list.delete(1);
        list.printList();
    }
}