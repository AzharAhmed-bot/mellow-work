import java.util.*;

public class Stack {
    ArrayList<Integer> Frontier= new ArrayList<>();
   
    public Stack(){
        
    }

 


    // Add to the top
    // . Add the new Node to the top
    public void push(int newNode ){
        Frontier.add(0,newNode);
    }

    // Remove the top element from the stack 
    public void pop(){
        if (!Frontier.isEmpty()) {
            // int topNode = Frontier.get(0); 
            Frontier.remove(0); 
        } else {
            System.out.println("Stack is empty");
        }
    }

    public int remove(){
        if(Frontier.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int node=Frontier.get(0);
            return node;
        }
    }
    

    public void print(){
       for(Integer number: Frontier){
        System.out.println(number);
        System.out.println("↑");
       }
       System.out.println("null");
       
    }

    public static void main(String[] args) {
        
        Stack stack=new Stack();
        System.out.println(stack.remove());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // stack.print();
        // stack.pop();
        // stack.pop();
        // stack.print();

        System.out.println(stack.remove());
        stack.print();
    }
}