public class SinglyLinkedList {
    Node head;
    public SinglyLinkedList(int head){
        this.head = new Node(head);
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head= newNode;
    }
    public void removeFirst(){
        if(head!=null){
            head=head.next;
        }

    }
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
