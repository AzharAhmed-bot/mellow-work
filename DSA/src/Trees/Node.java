package Trees;

public class Node {
 public int data;
 public Node rChild;
 public Node lChild;   
 
 public Node(int data){
    this.rChild=null;
    this.lChild=null;
    this.data=data;
 }
 public void setRChild(Node newNode){
    this.rChild=newNode;
 }
 public Node getRightChild(){
    return rChild;
 }

 public void setLChild(Node newNode){
    this.lChild=newNode;
 }
 public Node getLeftChild(){
    return lChild;
 }

 public void setData(int data){
    this.data=data;
 }
 public int getData(){
    return data;
 }



}
